package struct.facade;

public class AirConditioner implements HomeAppliances {

    @Override
    public void on() {
        System.out.println("打开了空调....");
    }

    @Override
    public void off() {
        System.out.println("关闭了空调....");
    }
}
