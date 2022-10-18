package factory.abstract_factory;

import factory.simple_factory.RouJiaMo;

/**
 * @优点: 当一个产品族中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品族中的对象。
 * @缺点: 当产品族中需要增加一个新的产品时，所有的工厂类都需要进行修改。
 * @使用场景: 1.当需要创建的对象是一系列相互关联或相互依赖的产品族时，如电器工厂中的电视机、洗衣机、空调等。
 * 2.系统中有多个产品族，但每次只使用其中的某一族产品。如有人只喜欢穿某一个品牌的衣服和鞋。
 * 3.系统中提供了产品的类库，且所有产品的接口相同，客户端不依赖产品实例的创建细节和内部结构。
 */
public abstract class RoujiaMoFactory {
    abstract public RouJiaMo createRouJiaMo();

    abstract public HuLaTang createMoJiaRou();
}
