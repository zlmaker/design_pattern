package action.status;


/**
 * 自动售货机
 */
public class VendingMachine {
    private State noMoneyState;
    private State hasMoneyState;
    private State soldState;
    private State soldOutState;
    private State currentState = null;
    private State winnerState;
    private int count = 0;

    public VendingMachine(int count) {
        noMoneyState = new NoMoneyState(this);
        hasMoneyState = new HasMoneyState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        winnerState = new WinnerState(this);

        if (count > 0) {
            this.count = count;
            currentState = noMoneyState;
        }
    }

    public int getCount() {
        return count;
    }

    public void setCurrentState(State state) {
        this.currentState = state;
    }

    public State getNoMoneyState() {
        return noMoneyState;
    }

    public VendingMachine setNoMoneyState(State noMoneyState) {
        this.noMoneyState = noMoneyState;
        return this;
    }

    public State getSoldState() {
        return soldState;
    }

    public VendingMachine setSoldState(State soldState) {
        this.soldState = soldState;
        return this;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public VendingMachine setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
        return this;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public VendingMachine setWinnerState(State winnerState) {
        this.winnerState = winnerState;
        return this;
    }

    public void insertMoney() {
        currentState.insertMoney();
    }

    public void backMoney() {
        currentState.backMoney();
    }

    public void turnCrank() {
        currentState.turnCrank();
        if (currentState == soldState || currentState == winnerState)
            currentState.dispense();
    }

    public void dispense() {
        System.out.println("发出一件商品...");
        if (count != 0) {
            count -= 1;
        }
    }
}
