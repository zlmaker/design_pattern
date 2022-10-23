package create.factory.simple_factory;

/**
 * @优点: 封装了创建对象的过程，可以通过参数直接获取对象。把对象的创建和业务逻辑层分开，这样以后就避免了修改客户代码，如果要实现新产品直接修改工厂类，而不需要在原代码中修改，这样就降低了客户代码修改的可能性，更加容易扩展。
 * @缺点: 增加新产品时还是需要修改工厂类的代码，违背了“开闭原则”。
 */
public class SimpleRouJiaMoFactory {
    public static RouJiaMo createRouJiaMo(String type) {
        RouJiaMo rouJiaMo = null;
        switch (type) {
            case "Suan":
                rouJiaMo = new SuanRouJiaMo();
                break;
            case "Tian":
                rouJiaMo = new TianRouJiaMo();
                break;
            case "La":
                rouJiaMo = new LaRouJiaMo();
                break;
        }
        return rouJiaMo;
    }
}
