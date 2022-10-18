package factory.abstract_factory;

public abstract class HuLaTang {
    protected String name;

    /**
     * 准备工作
     */
    public void prepare() {
        System.out.println("准备");
    }

    /**
     * 使用你们的专用袋-包装
     */
    public void pack() {
        System.out.println("包装");
    }

    /**
     * 秘制设备-烘烤2分钟
     */
    public void fire() {
        System.out.println("烘烤");
    }
}
