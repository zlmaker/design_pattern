package singleton;

/**
 * 线程不安全懒汉式
 */
public class Singleton1 {
    private static Singleton1 instance = null;

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        // 做一个判断是否已经被实例化了
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}

/**
 * 线程安全的懒汉式，但是完全不推荐，效率太低了，尽量不要用synchronized来实现线程安全
 */
class Singleton2 {
    private static Singleton2 instance = null;

    private Singleton2() {
    }

    public static synchronized Singleton2 getInstance() {
        // 做一个判断是否已经被实例化了
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}

/**
 * 线程不安全的懒汉式另一种实现方式，也是完全不推荐，效率低，算是最不推荐的一种了
 */
class Singleton3 {
    private static Singleton3 instance = null;

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                instance = new Singleton3();
            }
        }
        return instance;
    }
}

/**
 * 线程安全的懒汉式，使用双重检查来保证不会重复创建对象，是懒汉式中最推荐的一种写法了
 */
class Singleton4 {
    // 使用volatile来保证原子性和可见性
    private static volatile Singleton4 instance = null;

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        if (instance == null) {
            synchronized (Singleton4.class) {
                if (instance == null) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
