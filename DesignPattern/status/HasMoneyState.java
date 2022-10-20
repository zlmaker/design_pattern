package status;

import java.util.Random;

public class HasMoneyState implements State {
    private VendingMachine machine;
    private Random random = new Random();

    public HasMoneyState(VendingMachine machine) {
        this.machine = machine;
    }

    /**
     * 放钱
     */
    @Override
    public void insertMoney() {
        System.out.println("您已经投过币了，无需再投....");
    }

    /**
     * 退钱
     */
    @Override
    public void backMoney() {
        System.out.println("退币成功");
        machine.setCurrentState(machine.getNoMoneyState());
    }

    /**
     * 转动曲柄
     */
    @Override
    public void turnCrank() {
        System.out.println("你转动了手柄");
        int winner = random.nextInt(10);
        if (winner == 0 && machine.getCount() > 1) {
            machine.setCurrentState(machine.getWinnerState());
        } else {
            machine.setCurrentState(machine.getSoldState());
        }
    }

    /**
     * 出商品
     */
    @Override
    public void dispense() {
        throw new IllegalStateException("非法状态！");
    }
}
