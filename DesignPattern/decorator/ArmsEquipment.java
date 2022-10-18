package decorator;

public class ArmsEquipment implements Equipment {
    /**
     * 计算攻击力
     *
     * @return int
     */
    @Override
    public int calculateAttack() {
        return 20;
    }

    /**
     * 装备的描述
     *
     * @return String
     */
    @Override
    public String description() {
        return "屠龙刀";
    }
}
