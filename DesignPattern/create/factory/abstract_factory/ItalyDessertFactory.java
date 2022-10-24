package create.factory.abstract_factory;

import create.factory.simple_factory.Coffee;
import create.factory.simple_factory.LatteCoffee;

public class ItalyDessertFactory implements DessertFactory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }
}
