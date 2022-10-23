package create.factory.abstract_factory;

import create.factory.simple_factory.RouJiaMo;
import create.factory.simple_factory.SuanRouJiaMo;

public class XianRoujiaMoFactory extends RoujiaMoFactory {

    @Override
    public RouJiaMo createRouJiaMo() {
        return new SuanRouJiaMo();
    }

    @Override
    public HuLaTang createMoJiaRou() {
        return new SuanHuLaTang();
    }
}
