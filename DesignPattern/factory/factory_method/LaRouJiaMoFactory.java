package factory.factory_method;

import factory.simple_factory.LaRouJiaMo;
import factory.simple_factory.RouJiaMo;

public class LaRouJiaMoFactory extends RouJiaMoFactory {
    @Override
    public RouJiaMo createRouJiaMo() {
        return new LaRouJiaMo();
    }
}
