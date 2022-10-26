package struct.proxy.jdk_proxy;

/**
 * @定义: Java中提供了一个动态代理类Proxy，
 * Proxy并不是我们上述所说的代理对象的类，
 * 而是提供了一个创建代理对象的静态方法（newProxyInstance方法）来获取代理对象。
 */
public class ProxyTest {
    public static void main(String[] args) {
        MessageService sendService = new SendService();
        MessageService proxyInstance = (MessageService) ProxyFactory.getProxyInstance(sendService);
        proxyInstance.sendMessage("java");
    }
}
