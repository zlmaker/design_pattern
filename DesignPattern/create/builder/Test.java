package create.builder;

/**
 * @定义: 建造者模式可以将部件和其组装过程分开，一步一步创建一个复杂的对象。
 * 用户只需要指定复杂对象的类型就可以得到该对象，而无须知道其内部的具体构造细节。
 * @优点: 建造者模式很容易进行扩展。
 * 如果有新的需求，通过实现一个新的建造者类就可以完成，
 * 基本上不用修改之前已经测试通过的代码，因此也就不会对原有功能引入风险。符合开闭原则。
 * @缺点: 建造者模式所创建的产品一般具有较多的共同点，其组成部分相似，
 * 如果产品之间的差异性很大，则不适合使用建造者模式，因此其使用范围受到一定的限制。
 */
public class Test {
    public static void main(String[] args) {
        // 建造一个摩拜单车
        Director director = new Director(new OfoBuilder());
        Bike bike = director.construct();
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
        // 建造一个ofo单车
        Director director1 = new Director(new MobikeBuilder());
        Bike bike1 = director1.construct();
        System.out.println(bike1.getFrame());
        System.out.println(bike1.getSeat());
    }
}
