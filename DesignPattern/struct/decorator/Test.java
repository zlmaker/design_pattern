package struct.decorator;

/**
 * @定义: 指在不改变现有对象结构的情况下，动态地给该对象增加一些职责（即增加其额外功能）的模式。
 * @优点: 可以带来比继承更加灵活性的扩展功能，使用更加方便，
 * 可以通过组合不同的装饰者对象来获取具有不同行为状态的多样化的结果。
 * 装饰者模式比继承更具良好的扩展性，完美的遵循开闭原则，
 * 继承是静态的附加责任，装饰者则是动态的附加责任。
 * @缺点: 产生过多的子类
 */
public class Test {
    public static void main(String[] args) {
        // 一个镶嵌2颗红宝石，1颗蓝宝石的靴子
        System.out.println(" 一个镶嵌2颗红宝石，1颗蓝宝石的靴子");
        Equipment equip = new RedGemDecorator(new RedGemDecorator(new BlueGemDecorator(new ShoeEquipment())));
        System.out.println("攻击力  : " + equip.calculateAttack());
        System.out.println("描述 :" + equip.description());
        System.out.println("-------");
        // 一个镶嵌1颗红宝石，1颗蓝宝石的武器
        System.out.println(" 一个镶嵌1颗红宝石，1颗蓝宝石,1颗黄宝石的武器");
        equip = new RedGemDecorator(new BlueGemDecorator(new YellowGemDecorator(new ArmsEquipment())));
        System.out.println("攻击力  : " + equip.calculateAttack());
        System.out.println("描述 :" + equip.description());
        System.out.println("-------");
    }
}
