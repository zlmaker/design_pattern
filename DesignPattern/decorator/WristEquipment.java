package decorator;

public class WristEquipment implements Equipment {
    /**
     * 计算攻击力
     *
     * @return int
     */
    @Override
    public int calculateAttack() {
        return 5;
    }

    /**
     * 装备的描述
     *
     * @return String
     */
    @Override
    public String description() {
        return "圣战护腕";
    }
}
