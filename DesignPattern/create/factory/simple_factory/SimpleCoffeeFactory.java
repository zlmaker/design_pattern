package create.factory.simple_factory;

public class SimpleCoffeeFactory {
    public static Coffee createCoffee(String type) {
        switch (type) {
            case "American":
                return new AmericanCoffee();
            case "latte":
                return new LatteCoffee();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
