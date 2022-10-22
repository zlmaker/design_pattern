package mediator;

public class HouseOwner extends Person {
    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("房主" + name + "获取到的信息：" + message);
    }
}
