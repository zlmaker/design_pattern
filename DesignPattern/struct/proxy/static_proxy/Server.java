package struct.proxy.static_proxy;

public class Server implements NetWork {
    private String url;

    public Server(String url) {
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
