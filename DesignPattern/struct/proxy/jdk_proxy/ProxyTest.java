package struct.proxy.jdk_proxy;

public class ProxyTest {
    public static void main(String[] args) {
        MessageService sendService = new SendService();
        MessageService proxyInstance = (MessageService) ProxyFactory.getProxyInstance(sendService);
        proxyInstance.sendMessage("java");
    }
}
