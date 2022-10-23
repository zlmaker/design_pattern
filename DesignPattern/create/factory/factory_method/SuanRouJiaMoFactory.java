package create.factory.factory_method;

import create.factory.simple_factory.RouJiaMo;
import create.factory.simple_factory.SuanRouJiaMo;

public class SuanRouJiaMoFactory extends RouJiaMoFactory {

    @Override
    public RouJiaMo createRouJiaMo() {
        return new SuanRouJiaMo();
    }
}
