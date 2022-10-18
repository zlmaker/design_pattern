package factory.factory_method;

import factory.simple_factory.RouJiaMo;
import factory.simple_factory.TianRouJiaMo;

public class TianRouJiaMoFactory extends RouJiaMoFactory {

    @Override
    public RouJiaMo createRouJiaMo() {
        return new TianRouJiaMo();
    }
}
