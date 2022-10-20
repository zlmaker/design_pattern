package facade;

public class Light implements HomeAppliances {

    @Override
    public void on() {
        System.out.println("打开了灯....");
    }

    @Override
    public void off() {
        System.out.println("关闭了灯....");
    }
}
