package struct.proxy.static_proxy;

public class ProxyServer implements NetWork {
    private Server server;

    public ProxyServer(String url) {
        server = new Server(url);
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

    /**
     * 将真实服务器给隐藏起来，外界无法访问，模拟真实环境
     */
    private static class Server implements NetWork {
        private String url;

        private Server(String url) {
            this.url = url;
        }

        public String getUrl() {
            return url;
        }

        @Override
        public void browse() {
            System.out.println("我是真实访问的服务器,地址是" + url);
        }
    }
}
