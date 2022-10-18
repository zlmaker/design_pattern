package strategy;

public class Test {
    public static void main(String[] args) {
        RoleA roleA = new RoleA("A");
        roleA.setAttack(new AttackJY())
                .setDefend(new DefendTBS())
                .setRun(new RunJCTQ())
                .setDisplay(new DisplayA());
        System.out.println(roleA.name + ":");
        roleA.run();
        roleA.attack();
        roleA.defend();
        roleA.display();
    }
}
