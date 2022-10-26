package struct.adapter;

/**
 * @定义: 将一个类的接口转换成客户希望的另外一个接口，
 * 使得原本由于接口不兼容而不能一起工作的那些类能一起工作。
 */
public class Test {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        V5Power v5Power = new V5PowerAdapter(new V220Power());
        mobile.inputPower(v5Power);
    }
}
