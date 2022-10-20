package status;

public class NoMoneyState implements State {

    private VendingMachine machine;

    public NoMoneyState(VendingMachine machine) {
        this.machine = machine;
    }

    /**
     * 放钱
     */
    @Override
    public void insertMoney() {
        System.out.println("投币成功");
        machine.setCurrentState(machine.getNoMoneyState());

    }

    /**
     * 退钱
     */
    @Override
    public void backMoney() {
        System.out.println("您未投币，想退钱？...");
    }

    /**
     * 转动曲柄
     */
    @Override
    public void turnCrank() {
        System.out.println("您未投币，想拿东西么？...");
    }

    /**
     * 出商品
     */
    @Override
    public void dispense() {
        throw new IllegalStateException("非法状态！");
    }
}
