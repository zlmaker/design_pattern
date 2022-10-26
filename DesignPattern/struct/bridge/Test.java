package struct.bridge;

/**
 * @定义: 将抽象与实现分离，使它们可以独立变化。
 * 它是用组合关系代替继承关系来实现，从而降低了抽象和实现这两个可变维度的耦合度。
 * @优点: 桥接模式提高了系统的可扩充性，
 * 在两个变化维度中任意扩展一个维度，都不需要修改原有系统。
 */
public class Test {
    public static void main(String[] args) {
        SystemVersion os = new Windows(new AVIFile());
        os.play("战狼3");
    }
}
