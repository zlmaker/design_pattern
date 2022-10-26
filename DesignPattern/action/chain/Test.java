package action.chain;

/**
 * @定义: 又名职责链模式，为了避免请求发送者与多个请求处理者耦合在一起，
 * 将所有请求的处理者通过前一对象记住其下一个对象的引用而连成一条链；
 * 当有请求发生时，可将请求沿着这条链传递，直到有对象处理它为止。
 * @优点: 责任链简化了对象之间的连接，一个对象只需保持一个指向其后继者的引用，
 * 不需保持其他所有处理者的引用；
 * 责任分担，每个类只需要处理自己该处理的工作，不能处理的传递给下一个对象完成，
 * 明确各类的责任范围，符合类的单一职责原则。
 * @缺点: 不能保证每个请求一定被处理。由于一个请求没有明确的接收者，
 * 所以不能保证它一定会被处理，该请求可能一直传到链的末端都得不到处理。
 * 对比较长的职责链，请求的处理可能涉及多个处理对象，系统性能将受到一定影响。
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
