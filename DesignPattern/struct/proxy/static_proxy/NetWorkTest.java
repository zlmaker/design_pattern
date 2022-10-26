package struct.proxy.static_proxy;

/**
 * @定义: 由于某些原因需要给某对象提供一个代理以控制对该对象的访问。
 * 这时，访问对象不适合或者不能直接引用目标对象，代理对象作为访问对象和目标对象之间的中介。
 * @优点: 代理模式在客户端与目标对象之间起到一个中介作用和保护目标对象的作用；
 * 代理对象可以扩展目标对象的功能；
 * 代理模式能将客户端与目标对象分离，在一定程度上降低了系统的耦合度；
 * @缺点: 增加了系统的复杂度。
 */
public class NetWorkTest {
    public static void main(String[] args) {
        ProxyServer proxyServer = new ProxyServer("192.168.0.1");
        proxyServer.browse();
    }
}
