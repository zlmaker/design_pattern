package struct.bridge;

/**
 * 将抽象与实现分离，使它们可以独立变化。
 * 它是用组合关系代替继承关系来实现，从而降低了抽象和实现这两个可变维度的耦合度。
 */
public class Test {
    public static void main(String[] args) {
        SystemVersion os = new Windows(new AVIFile());
        os.play("战狼3");
    }
}