package struct.facade;

public class TV implements HomeAppliances {

    @Override
    public void on() {
        System.out.println("打开了电视....");
    }

    @Override
    public void off() {
        System.out.println("关闭了电视....");
    }
}
