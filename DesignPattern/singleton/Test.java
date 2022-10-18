package singleton;

public class Test {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton1 instance1 = Singleton1.getInstance();
        Singleton2 instance2 = Singleton2.getInstance();
        Singleton3 instance3 = Singleton3.getInstance();
        Singleton4 instance4 = Singleton4.getInstance();
        Singleton5 instance5 = Singleton5.getInstance();
        SingletonEnum instance6 = SingletonEnum.instance;
    }
}
