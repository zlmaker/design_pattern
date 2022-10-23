package action.template;

public class QAWorker extends Worker {
    public QAWorker(String name) {
        super(name);
    }

    /**
     * 工作，这个不是固定的因此设为抽象方法
     */
    @Override
    public void work() {
        System.out.println(name + "写测试用例-提交bug-写测试用例");
    }
}
