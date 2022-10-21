package proxy.static_proxy;

public class NetWorkTest {
    public static void main(String[] args) {
        Server server = new Server("192.168.0.1");
        ProxyServer proxyServer = new ProxyServer(server);
        proxyServer.browse();
    }
}
