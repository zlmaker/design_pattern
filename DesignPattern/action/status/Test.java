package action.status;

/**
 * @定义: 对有状态的对象，把复杂的“判断逻辑”提取到不同的状态对象中，
 * 允许状态对象在其内部状态发生改变时改变其行为。
 * @优点: 将所有与某个状态有关的行为放到一个类中，
 * 并且可以方便地增加新的状态，只需要改变对象状态即可改变对象的行为。
 * @缺点: 状态模式的使用必然会增加系统类和对象的个数，对"开闭原则"的支持并不太好
 */
public class Test {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine(50);
        machine.insertMoney();
        machine.backMoney();
        System.out.println("-----我要中奖-----");
        for (int i = 0; i < 10; i++) {
            machine.insertMoney();
            machine.turnCrank();
        }
        System.out.println("-----压力测试-----");
        machine.insertMoney();
        machine.backMoney();
        // 无效操作
        machine.backMoney();
        machine.turnCrank();
        machine.turnCrank();
        machine.backMoney();
    }
}
