package builder;

/**
 * 建造者模式除了Test之中的用途外，在开发中还有一个常用的使用方式
 * 就是当一个类构造器需要传入很多参数时，如果创建这个类的实例，
 * 代码可读性会非常差，而且很容易引入错误，此时就可以利用建造者模式进行重构。
 */
public class PhoneBuilder {
    public static void main(String[] args) {
        Phone phone = new Phone.Builder()
                .cpu("AMD")
                .mainboard("联想")
                .memory("金士顿")
                .screen("联想")
                .build();
        System.out.println(phone);
    }
}
