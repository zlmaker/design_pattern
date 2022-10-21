package singleton;

/**
 * 使用内部类的类加载机制保证线程安全，但与饿汉式不同是内部类是只有使用getInstance才会加载SingleHolder类
 * 避免了线程不安全，延迟加载，效率高。
 */
public class Singleton5 {
    private Singleton5() {
    }

    public static Singleton5 getInstance() {
        return SingletonHolder.instance;
    }

    private static class SingletonHolder {
        private static final Singleton5 instance = new Singleton5();
    }
}
