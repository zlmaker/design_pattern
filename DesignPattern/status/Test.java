package status;

/**
 * 对有状态的对象，把复杂的“判断逻辑”提取到不同的状态对象中，允许状态对象在其内部状态发生改变时改变其行为。
 */
public class Test {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine(10);
        machine.insertMoney();
        machine.backMoney();
        System.out.println("-----我要中奖-----");
        machine.insertMoney();
        machine.turnCrank();
        machine.insertMoney();
        machine.turnCrank();
        machine.insertMoney();
        machine.turnCrank();
        machine.insertMoney();
        machine.turnCrank();
        machine.insertMoney();
        machine.turnCrank();
        machine.insertMoney();
        machine.turnCrank();
        machine.insertMoney();
        machine.turnCrank();
        System.out.println("-----压力测试-----");
        machine.insertMoney();
        machine.backMoney();
        machine.backMoney();
        machine.turnCrank();// 无效操作
        machine.turnCrank();// 无效操作
        machine.backMoney();
    }
}
