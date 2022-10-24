package create.factory.simple_factory;

public abstract class Coffee {
    public abstract String getName();

    public void addMilk() {
        System.out.println("添加牛奶");
    }

    public void addSugar() {
        System.out.println("添加糖");
    }
}
