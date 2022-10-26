package action.memento;

/**
 * 这里也可以将这个类放到GameRole里面，使其成为私有的内部类
 */
public class RoleStateMemento {
    private int vit;
    private int atk;
    private int def;

    public RoleStateMemento(int vit, int atk, int def) {
        this.vit = vit;
        this.atk = atk;
        this.def = def;
    }

    public int getVit() {
        return vit;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

}
