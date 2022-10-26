package create.builder;

public class OfoBuilder extends Builder {
    @Override
    public void buildFrame() {
        bike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("橡胶车座");
    }

    @Override
    public Bike createBike() {
        // 会经过一系列的组装和加工，然后返回自行车
        return bike;
    }
}
