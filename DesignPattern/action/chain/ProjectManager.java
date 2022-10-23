package action.chain;

public class ProjectManager extends Handler {
    public ProjectManager() {
        //部门经理处理3-7天的请假
        super(NUM_THREE, NUM_SEVEN);
    }

    @Override
    public void handleLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName() + "请假" + leaveRequest.getNum() + "天," + leaveRequest.getContent() + "。");
        System.out.println("部门经理审批：同意。");
    }
}
