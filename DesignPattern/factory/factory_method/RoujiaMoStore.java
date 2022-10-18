package factory.factory_method;

import factory.simple_factory.RouJiaMo;

public class RoujiaMoStore {
    private RouJiaMoFactory factory;

    public RoujiaMoStore(RouJiaMoFactory factory) {
        this.factory = factory;
    }

    public RouJiaMo sellRouJiaMo() {
        RouJiaMo rouJiaMo = factory.createRouJiaMo();
        rouJiaMo.prepare();
        rouJiaMo.fire();
        rouJiaMo.pack();
        return rouJiaMo;
    }
}
