package create.factory.factory_method;

import create.factory.simple_factory.Coffee;
import create.factory.simple_factory.LatteCoffee;

public class LatteCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
