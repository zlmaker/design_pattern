package struct.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 使用内部类来实现线程安全的懒汉式单例模式
 */
public class BoxFactory {
    private static Map<String, Box> boxMap;

    private BoxFactory() {
        boxMap = new HashMap<>();
        boxMap.put("I", new IBox());
        boxMap.put("L", new LBox());
        boxMap.put("O", new OBox());
    }

    public static BoxFactory getInstance() {
        return SingletonHolder.instance;
    }

    public Box getBox(String key) {
        return boxMap.get(key);
    }

    public static final class SingletonHolder {
        private static final BoxFactory instance = new BoxFactory();
    }
}
