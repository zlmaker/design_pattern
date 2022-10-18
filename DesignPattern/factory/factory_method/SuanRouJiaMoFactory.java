package factory.factory_method;

import factory.simple_factory.RouJiaMo;
import factory.simple_factory.SuanRouJiaMo;

public class SuanRouJiaMoFactory extends RouJiaMoFactory {

    @Override
    public RouJiaMo createRouJiaMo() {
        return new SuanRouJiaMo();
    }
}
