package action.observer;

public class Observer1 implements Observer {
    private String name;

    public Observer1(String name) {
        this.name = name;
    }


    @Override
    public void update(String msg) {
        System.out.println("observer1 得到 3D 号码  -->" + msg + ", 我要记下来。");
    }
}
