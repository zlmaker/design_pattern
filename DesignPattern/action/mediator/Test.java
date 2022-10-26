package action.mediator;

/**
 * @定义: 又叫调停模式，定义一个中介角色来封装一系列对象之间的交互，
 * 使原有对象之间的耦合松散，且可以独立地改变它们之间的交互。
 * @优点: 中介者模式通过把多个同事对象之间的交互封装到中介者对象里面，
 * 从而使得同事对象之间松散耦合，基本上可以做到互补依赖。
 * 这样一来，同事对象就可以独立地变化和复用，而不再像以前那样“牵一处而动全身”了。
 * 多个同事对象的交互，被封装在中介者对象里面集中管理，
 * 使得这些交互行为发生变化的时候，只需要修改中介者对象就可以了，
 * 当然如果是已经做好的系统，那么就扩展中介者对象，而各个同事类不需要做修改。
 * @缺点: 当同事类太多时，中介者的职责将很大，它会变得复杂而庞大，以至于系统难以维护。
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
