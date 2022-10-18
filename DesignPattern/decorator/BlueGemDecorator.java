package decorator;

public class BlueGemDecorator implements EquipmentDecorator {
    /**
     * 每个装饰品维护一个装备
     */
    private Equipment equipment;

    public BlueGemDecorator(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public int calculateAttack() {
        return 5 + equipment.calculateAttack();
    }

    @Override
    public String description() {
        return equipment.description() + "+ 蓝宝石";
    }
}
