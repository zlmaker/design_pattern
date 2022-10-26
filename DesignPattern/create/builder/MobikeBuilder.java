package create.builder;

public class MobikeBuilder extends Builder {
    @Override
    public void buildFrame() {
        bike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("真皮车座");
    }

    @Override
    public Bike createBike() {
        // 会经过一系列的组装和加工，然后返回自行车
        return bike;
    }
}
