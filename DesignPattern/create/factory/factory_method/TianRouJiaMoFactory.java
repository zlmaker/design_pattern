package create.factory.factory_method;

import create.factory.simple_factory.RouJiaMo;
import create.factory.simple_factory.TianRouJiaMo;

public class TianRouJiaMoFactory extends RouJiaMoFactory {

    @Override
    public RouJiaMo createRouJiaMo() {
        return new TianRouJiaMo();
    }
}
