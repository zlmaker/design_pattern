package struct.proxy.static_proxy;

public class ProxyServer implements NetWork {
    private Server server;

    public ProxyServer(Server server) {
        this.server = server;
    }

    private void checkNetWork() {
        System.out.println("检查网络");
    }

    @Override
    public void browse() {
        System.out.println("我是代理服务器，我将帮你去访问真实服务器,地址是" + server.getUrl());
        checkNetWork();
        server.browse();
    }
}
