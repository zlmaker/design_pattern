package factory.abstract_factory;

import factory.simple_factory.RouJiaMo;
import factory.simple_factory.TianRouJiaMo;

public class LuoYangRoujiaMoFactory extends RoujiaMoFactory {
    @Override
    public RouJiaMo createRouJiaMo() {
        return new TianRouJiaMo();
    }

    @Override
    public HuLaTang createMoJiaRou() {
        return new TianHuLaTang();
    }
}
