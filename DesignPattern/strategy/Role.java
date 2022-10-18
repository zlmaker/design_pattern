package strategy;

public abstract class Role {
    protected String name;
    // 这里就没必要将这四个字段传递给子类了
    private Defend defend;
    private Display display;
    private Run run;
    private Attack attack;

    // 这里返回Role没有其他含义，就是为了后面测试时可以链式调用
    public Role setDefend(Defend defend) {
        this.defend = defend;
        return this;
    }

    public Role setAttack(Attack attack) {
        this.attack = attack;
        return this;
    }

    public Role setRun(Run run) {
        this.run = run;
        return this;
    }

    public Role setDisplay(Display display) {
        this.display = display;
        return this;
    }

    protected void display() {
        display.display();
    }

    protected void run() {
        run.run();
    }

    protected void attack() {
        attack.attack();
    }

    protected void defend() {
        defend.defend();
    }
}
