package strategy;

/**
 * 该模式定义了一系列算法，并将每个算法封装起来，使它们可以相互替换，且算法的变化不会影响使用算法的客户。策略模式属于对象行为模式，它通过对算法进行封装，把使用算法的责任和算法的实现分割开来，并委派给不同的对象对这些算法进行管理。
 */
public class Test {
    public static void main(String[] args) {
        // 给每个对象起名
        Role roleA = new RoleA("A");
        Role roleB = new RoleB("B");
        // 后面的设置相当与给对象配置相应的策略或者算法
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
