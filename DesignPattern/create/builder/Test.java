package create.builder;

/**
 * 建造者模式可以将部件和其组装过程分开，一步一步创建一个复杂的对象。
 * 用户只需要指定复杂对象的类型就可以得到该对象，而无须知道其内部的具体构造细节。
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
