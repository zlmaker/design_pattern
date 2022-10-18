package observer;

public class Test {
    public static void main(String[] args) {
        ObjectFor3D objectFor3D = new ObjectFor3D();
        Observer1 observer1 = new Observer1(objectFor3D);
        Observer2 observer2 = new Observer2(objectFor3D);
        objectFor3D.setMsg("20140420的3D号码是：127");
        objectFor3D.setMsg("20140420的3D号码是：127");
    }
}
