package action.mediator;

/**
 * 又叫调停模式，定义一个中介角色来封装一系列对象之间的交互，
 * 使原有对象之间的耦合松散，且可以独立地改变它们之间的交互。
 */
public class Test {
    public static void main(String[] args) {
        MediatorStructure mediatorStructure = new MediatorStructure();
        HouseOwner houseOwner = new HouseOwner("张三", mediatorStructure);
        Tenant tenant = new Tenant("李四", mediatorStructure);
        tenant.contact("需要租三室的房子");
        houseOwner.contact("我这有三室的房子，你需要租吗？");
    }
}
