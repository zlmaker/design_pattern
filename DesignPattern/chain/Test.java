package chain;

/**
 * 又名职责链模式，为了避免请求发送者与多个请求处理者耦合在一起，
 * 将所有请求的处理者通过前一对象记住其下一个对象的引用而连成一条链；
 * 当有请求发生时，可将请求沿着这条链传递，直到有对象处理它为止。
 */
public class Test {
    public static void main(String[] args) {
        //请假条
        LeaveRequest leaveRequest = new LeaveRequest("小花", 5, "身体不适");
        //各位领导
        GroupLeader groupLeader = new GroupLeader();
        ProjectManager projectManager = new ProjectManager();
        GeneralManager generalManager = new GeneralManager();

        groupLeader.setNextHandler(projectManager);//小组长的领导是部门经理
        projectManager.setNextHandler(generalManager);//部门经理的领导是总经理
        groupLeader.submit(leaveRequest);
    }
}
