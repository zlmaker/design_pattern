package action.memento.whiteBox;

/**
 * 又叫快照模式，在不破坏封装性的前提下，捕获一个对象的内部状态，
 * 并在该对象之外保存这个状态，以便以后当需要时能将该对象恢复到原先保存的状态。
 * 白箱备忘录模式是破坏封装性的。但是通过程序员自律，同样可以在一定程度上实现模式的大部分用意。
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("------------大战Boss前------------");
        GameRole gameRole = new GameRole();
        gameRole.initState();
        gameRole.stateDisplay();
        System.out.println("------------保存进度--------------");
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setRoleStateMemento(gameRole.saveState());
        System.out.println("------------大战Boss后------------");
        gameRole.fight();
        gameRole.stateDisplay();
        System.out.println("------------恢复之前进度-----------");
        gameRole.recoverState(roleStateCaretaker.getRoleStateMemento());
        gameRole.stateDisplay();
    }
}
