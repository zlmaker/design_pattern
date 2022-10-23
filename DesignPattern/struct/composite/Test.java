package struct.composite;

/**
 * 又名部分整体模式，是用于把一组相似的对象当作一个单一的对象。
 * 组合模式依据树形结构来组合对象，用来表示部分以及整体层次。
 * 这种类型的设计模式属于结构型模式，它创建了对象组的树形结构。
 */
public class Test {
    public static void main(String[] args) {
        MenuComponent rootMenu = new Menu("DesignPattern", 3);
        MenuComponent childMenu = new Menu("composite", 2);
        childMenu.add(new MenuItem("Menu.java", 1));
        rootMenu.add(childMenu);
        System.out.println("========root========");
        rootMenu.print();
        System.out.println("========child========");
        childMenu.print();
    }
}
