package create.factory.abstract_factory;

import create.factory.simple_factory.Coffee;

/**
 * @优点: 当一个产品族中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品族中的对象。
 * @缺点: 当产品族中需要增加一个新的产品时，所有的工厂类都需要进行修改。
 */
public interface DessertFactory {
    Coffee createCoffee();

    Dessert createDessert();
}
