package struct.proxy.jdk_proxy;

import java.lang.reflect.Proxy;

public class ProxyFactory {
    public static Object getProxyInstance(Object targetObject) {
        return Proxy.newProxyInstance(
                targetObject.getClass().getClassLoader(),
                targetObject.getClass().getInterfaces(),
                (proxy, method, args) -> method.invoke(targetObject, args)
        );

    }
}
