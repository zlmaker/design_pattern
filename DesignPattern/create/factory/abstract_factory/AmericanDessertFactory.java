package create.factory.abstract_factory;

import create.factory.simple_factory.AmericanCoffee;
import create.factory.simple_factory.Coffee;

public class AmericanDessertFactory implements DessertFactory {
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Macaroon();
    }
}
