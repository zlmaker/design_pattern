package singleton;

/**
 * 饿汉式
 */
public class Singleton {
    // 在类加载的时候才会创建这个对象
    private static final Singleton instance = new Singleton();

    // 私有构造方法
    private Singleton() {
    }

    // 对外提供公共方法来获取该对象
    public static Singleton getInstance() {
        return instance;
    }
}
