package action.observer;

public class Observer2 implements Observer {
    private String name;

    public Observer2(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println("observer2 得到 3D 号码 -->" + msg + "我要告诉舍友们。");
    }
}
