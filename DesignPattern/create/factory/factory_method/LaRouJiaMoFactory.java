package create.factory.factory_method;

import create.factory.simple_factory.LaRouJiaMo;
import create.factory.simple_factory.RouJiaMo;

public class LaRouJiaMoFactory extends RouJiaMoFactory {
    @Override
    public RouJiaMo createRouJiaMo() {
        return new LaRouJiaMo();
    }
}
