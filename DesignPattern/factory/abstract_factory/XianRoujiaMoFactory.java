package factory.abstract_factory;

import factory.simple_factory.RouJiaMo;
import factory.simple_factory.SuanRouJiaMo;

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
