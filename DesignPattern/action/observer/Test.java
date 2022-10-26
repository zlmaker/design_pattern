package action.observer;

/**
 * @定义: 又被称为发布-订阅（Publish/Subscribe）模式，
 * 它定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象。
 * 这个主题对象在状态变化时，会通知所有的观察者对象，使他们能够自动更新自己。
 * @优点: 被观察者发送通知，所有注册的观察者都会收到信息【可以实现广播机制】
 * @缺点: 如果观察者非常多的话，那么所有的观察者收到被观察者发送的通知会耗时。
 * 如果被观察者有循环依赖的话，那么被观察者发送通知会使观察者循环调用，会导致系统崩溃
 */
public class Test {
    public static void main(String[] args) {
        ObjectFor3D objectFor3D = new ObjectFor3D();
        Observer1 observer1 = new Observer1("张三");
        Observer2 observer2 = new Observer2("李四");
        objectFor3D.registerObserver(observer1);
        objectFor3D.registerObserver(observer2);
        objectFor3D.notifyObservers("20140420的3D号码是：127");
        objectFor3D.notifyObservers("20140420的3D号码是：127");
    }
}
