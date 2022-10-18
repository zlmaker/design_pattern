package decorator;

public class YellowGemDecorator implements EquipmentDecorator {
    /**
     * 每个装饰品维护一个装备
     */
    private Equipment equipment;

    public YellowGemDecorator(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public int calculateAttack() {
        return 10 + equipment.calculateAttack();
    }

    @Override
    public String description() {
        return equipment.description() + "+ 黄宝石";
    }
}
