package action.observer;

import java.util.ArrayList;
import java.util.List;

public class ObjectFor3D implements Subject {
    private List<Observer> observers = new ArrayList<>();

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
    public void notifyObservers(String msg) {
        for (Observer observer : observers) {
            observer.update(msg);
        }
    }
}
