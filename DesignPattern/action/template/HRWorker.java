package action.template;

public class HRWorker extends Worker {
    public HRWorker(String name) {
        super(name);
    }

    /**
     * 工作，这个不是固定的因此设为抽象方法
     */
    @Override
    public void work() {
        System.out.println(name + "看简历-打电话-接电话");
    }
}
