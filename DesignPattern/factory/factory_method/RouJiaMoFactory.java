package factory.factory_method;

import factory.simple_factory.RouJiaMo;

/**
 * @优点: 1.用户只需要知道具体工厂的名称就可得到所要的产品，无须知道产品的具体创建过程；
 * 2.在系统增加新的产品时只需要添加具体产品类和对应的具体工厂类，无须对原工厂进行任何修改，满足开闭原则；
 * @缺点: 每增加一个产品就要增加一个具体产品类和一个对应的具体工厂类，这增加了系统的复杂度。
 */
public abstract class RouJiaMoFactory {
    public abstract RouJiaMo createRouJiaMo();
}
