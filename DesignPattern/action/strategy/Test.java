package action.strategy;

/**
 * @定义: 该模式定义了一系列算法，并将每个算法封装起来，
 * 使它们可以相互替换，且算法的变化不会影响使用算法的客户。
 * 策略模式属于对象行为模式，它通过对算法进行封装，
 * 把使用算法的责任和算法的实现分割开来，并委派给不同的对象对这些算法进行管理。
 * @优点: 策略类之间可以自由切换，易于扩展，避免使用多重条件选择语句，充分体现面向对象设计思想。
 * @缺点: 客户端必须知道所有的策略类，并自行决定使用哪一个策略类。
 * 将造成产生很多策略类，可以通过使用享元模式在一定程度上减少对象的数量。
 */
public class Test {
    public static void main(String[] args) {
        // 给每个对象起名
        Role roleA = new RoleA("A");
        Role roleB = new RoleB("B");
        // 后面的设置相当与给对象配置相应的策略或者算法，
        // 可以自行决定选择那些算法，形成不同的策略
        roleA.setAttack(new AttackJY())
                .setDefend(new DefendTBS())
                .setRun(new RunJCTQ())
                .setDisplay(new Display1());
        roleB.setDisplay(new Display2())
                .setRun(new RunCSFY())
                .setDefend(new DefendJZZ())
                .setAttack(new AttackKH());
        // 执行
        System.out.println(roleA.name + ":");
        roleA.run();
        roleA.attack();
        roleA.defend();
        roleA.display();
        System.out.println(roleB.name + ":");
        roleB.attack();
        roleB.run();
        roleB.display();
        roleB.defend();
    }
}
