package action.memento.blackBox;

/**
 * 备忘录角色对发起人对象提供一个宽接口，而为其他对象提供一个窄接口。
 * 在Java语言中，实现双重接口的办法就是将备忘录类设计成发起人类的内部成员类。
 * 将 RoleStateMemento 设为 GameRole 的内部类，从而将 RoleStateMemento 对象封装在 GameRole 里面；
 * 在外面提供一个标识接口 Memento 给 RoleStateCaretaker 及其他对象使用。
 * 这样 GameRole 类看到的是 RoleStateMemento 所有的接口，
 * 而RoleStateCaretaker及其他对象看到的仅仅是标识接口 Memento 所暴露出来的接口，从而维护了封装型。
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("------------大战Boss前------------");
        GameRole gameRole = new GameRole();
        gameRole.initState();
        gameRole.stateDisplay();
        System.out.println("------------保存进度--------------");
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setMemento(gameRole.saveState());
        System.out.println("------------大战Boss后------------");
        gameRole.fight();
        gameRole.stateDisplay();
        System.out.println("------------恢复之前进度-----------");
        gameRole.recoverState(roleStateCaretaker.getMemento());
        gameRole.stateDisplay();


    }
}
