package struct.decorator;

public class RedGemDecorator implements EquipmentDecorator {
    /**
     * 每个装饰品维护一个装备
     */
    private Equipment equipment;

    public RedGemDecorator(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public int calculateAttack() {
        return 15 + equipment.calculateAttack();
    }

    @Override
    public String description() {
        return equipment.description() + "+ 红宝石";
    }
}
