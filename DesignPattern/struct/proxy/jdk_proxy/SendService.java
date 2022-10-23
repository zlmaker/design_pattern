package struct.proxy.jdk_proxy;

public class SendService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("send message:" + message);
    }
}
