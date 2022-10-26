package action.chain;

public abstract class Handler {
    /**
     * 这里的这个常量你可以搞成一个enum，
     * 这里为了方便就直接使用了protected关键字来让子类共享常量
     */
    protected static final int NUM_ONE = 1;
    protected static final int NUM_THREE = 3;
    protected static final int NUM_SEVEN = 7;
    //该领导处理的请假天数区间
    private int numStart;
    private int numEnd;

    //领导上面还有领导
    private Handler nextHandler;

    //设置请假天数范围 上不封顶
    protected Handler(int numStart) {
        this.numStart = numStart;
        this.numEnd = Integer.MAX_VALUE;
    }

    //设置请假天数范围
    protected Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    //设置上级领导
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    //提交请假条
    public void submit(LeaveRequest leaveRequest) {
        if (numStart <= 0 && leaveRequest.getNum() <= 0) {
            System.out.println("无法处理该请求");
            return;
        }

        if (leaveRequest.getNum() >= numStart && leaveRequest.getNum() < numEnd) {
            handleLeave(leaveRequest);//如果请假天数达到该领导者的处理要求
        } else if (leaveRequest.getNum() >= numEnd && nextHandler != null) {
            nextHandler.submit(leaveRequest);//如果还有上级 并且请假天数超过了当前领导的处理范围
        } else {
            System.out.println("流程结束");
        }
    }

    //各级领导处理请假条方法
    public abstract void handleLeave(LeaveRequest leaveRequest);
}
