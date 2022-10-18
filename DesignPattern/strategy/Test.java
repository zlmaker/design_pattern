package strategy;

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
