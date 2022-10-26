package action.memento;

/**
 * @定义: 又叫快照模式，在不破坏封装性的前提下，捕获一个对象的内部状态，
 * 并在该对象之外保存这个状态，以便以后当需要时能将该对象恢复到原先保存的状态。
 * 白箱备忘录模式是破坏封装性的。但是通过程序员自律，同样可以在一定程度上实现模式的大部分用意。
 * @优点: 提供了一种可以恢复状态的机制。当用户需要时能够比较方便地将数据恢复到某个历史的状态。
 * 实现了内部状态的封装。除了创建它的发起人之外，其他对象都不能够访问这些状态信息。
 * 发起人不需要管理和保存其内部状态的各个备份，
 * 所有状态信息都保存在备忘录中，并由管理者进行管理，这符合单一职责原则。
 * @缺点: 资源消耗大。如果要保存的内部状态信息过多或者特别频繁，将会占用比较大的内存资源。
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
