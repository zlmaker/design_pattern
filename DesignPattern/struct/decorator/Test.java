package struct.decorator;

/**
 * 指在不改变现有对象结构的情况下，动态地给该对象增加一些职责（即增加其额外功能）的模式。
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
