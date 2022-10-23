package visitor;

/**
 * 封装一些作用于某种数据结构中的各元素的操作，
 * 它可以在不改变这个数据结构的前提下定义作用于这些元素的新的操作。
 */
public class Test {
    public static void main(String[] args) {
        Home home = new Home();
        home.add(new Dog());
        home.add(new Cat());
        Owner owner = new Owner();
        home.action(owner);
        Someone someone = new Someone();
        home.action(someone);
    }
}
