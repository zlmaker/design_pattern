package action.template;

public class ITWorker extends Worker {
    public ITWorker(String name) {
        super(name);
    }

    /**
     * 工作，这个不是固定的因此设为抽象方法
     */
    @Override
    public void work() {
        System.out.println(name + "写程序-测bug-修bug");
    }
}
