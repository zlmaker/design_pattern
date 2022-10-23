package action.chain;

public class GroupLeader extends Handler {
    public GroupLeader() {
        super(NUM_ONE, NUM_THREE);
    }

    @Override
    public void handleLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName() + "请假" + leaveRequest.getNum() + "天," + leaveRequest.getContent() + "。");
        System.out.println("小组长审批：同意。");
    }
}
