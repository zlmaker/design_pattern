package action.visitor;

/**
 * @定义: 封装一些作用于某种数据结构中的各元素的操作，
 * 它可以在不改变这个数据结构的前提下定义作用于这些元素的新的操作。
 * @优点: 通过访问者来分离无关的行为，把相关的行为封装在一起，
 * 构成一个访问者，这样每一个访问者的功能都比较单一。
 * 通过访问者来定义整个对象结构通用的功能，从而提高复用程度。
 * @缺点: 违反了依赖倒置原则，访问者模式依赖了具体类，而没有依赖抽象类。
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
