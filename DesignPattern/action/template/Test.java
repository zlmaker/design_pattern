package action.template;

/**
 * @定义: 定义一个操作中的算法骨架，而将算法的一些步骤延迟到子类中，
 * 使得子类可以不改变该算法结构的情况下重定义该算法的某些特定步骤。
 * @优点: 提高代码复用性, 将相同部分的代码放在抽象的父类中，而将不同的代码放入不同的子类中。
 * @缺点: 对每个不同的实现都需要定义一个子类，这会导致类的个数增加，系统更加庞大，设计也更加抽象。
 */
public class Test {
    public static void main(String[] args) {
        Worker it1 = new ITWorker("小王");
        it1.workOneDay();
        Worker it2 = new ITWorker("老张");
        it2.workOneDay();
        Worker hr = new HRWorker("迪迪");
        hr.workOneDay();
        Worker qa = new QAWorker("老李");
        qa.workOneDay();
        Worker pm = new ManagerWorker("坑货");
        pm.workOneDay();

    }
}
