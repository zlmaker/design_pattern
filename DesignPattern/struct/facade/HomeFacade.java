package struct.facade;

public class HomeFacade {
    private static final HomeAppliances light = new Light();
    private static final HomeAppliances tv = new TV();
    private static final HomeAppliances airConditioner = new AirConditioner();

    public void say(String msg) {
        if (msg.contains("打开")) {
            on();
        } else if (msg.contains("关闭")) {
            off();
        } else {
            System.out.println("请发出包含打开或者关闭的命令");
        }
    }

    /**
     * 可以按照你自己规划的顺序来执行打开或关闭命令
     */
    private void off() {
        System.out.println("正在为您关闭所有智能家电");
        light.off();
        tv.off();
        airConditioner.off();
    }

    private void on() {
        System.out.println("正在为您打开所有智能家电");
        light.on();
        tv.on();
        airConditioner.on();
    }
}
