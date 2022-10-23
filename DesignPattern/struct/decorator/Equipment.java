package struct.decorator;

public interface Equipment {
    /**
     * 计算攻击力
     *
     * @return int
     */
    int calculateAttack();

    /**
     * 装备的描述
     *
     * @return String
     */
    String description();
}
