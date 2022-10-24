package create.factory.factory_method;

import create.factory.simple_factory.AmericanCoffee;
import create.factory.simple_factory.Coffee;

public class AmericanCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
