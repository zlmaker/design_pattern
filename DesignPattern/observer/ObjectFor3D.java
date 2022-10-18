package observer;

import java.util.ArrayList;
import java.util.List;

public class ObjectFor3D implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String msg;

    /**
     * 注册一个观察着
     *
     * @param observer
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * 移除一个观察者
     *
     * @param observer
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知所有的观察着
     */
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(msg);
        }
    }

    /**
     * 主题更新消息
     *
     * @param msg
     */
    public void setMsg(String msg) {
        this.msg = msg;

        notifyObservers();
    }

}
