package action.template;

public class ManagerWorker extends Worker {
    public ManagerWorker(String name) {
        super(name);
    }

    /**
     * 工作，这个不是固定的因此设为抽象方法
     */
    @Override
    public void work() {
        System.out.println(name + "打LOL...");
    }
}
