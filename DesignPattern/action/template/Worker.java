package action.template;

/**
 * 这个就相当于一个模板，将共有的提取出来，将不共有的方法设为抽象
 */
public abstract class Worker {
    protected String name;

    public Worker(String name) {
        this.name = name;
    }

    /**
     * 记录一天的工作，添加final关键字，防止被恶意篡改
     */
    public final void workOneDay() {

        System.out.println("-----------------work start ---------------");
        enterCompany();
        computerOn();
        work();
        computerOff();
        exitCompany();
        System.out.println("-----------------work end ---------------");

    }

    /**
     * 工作，这个不是固定的因此设为抽象方法
     */
    public abstract void work();

    /**
     * 关闭电脑
     */
    private void computerOff() {
        System.out.println(name + "关闭电脑");
    }

    /**
     * 打开电脑
     */
    private void computerOn() {
        System.out.println(name + "打开电脑");
    }

    /**
     * 进入公司
     */
    public void enterCompany() {
        System.out.println(name + "进入公司");
    }

    /**
     * 离开公司
     */
    public void exitCompany() {
        System.out.println(name + "离开公司");
    }
}
