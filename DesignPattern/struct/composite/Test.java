package struct.composite;

/**
 * @定义: 又名部分整体模式，是用于把一组相似的对象当作一个单一的对象。
 * 组合模式依据树形结构来组合对象，用来表示部分以及整体层次。
 * 这种类型的设计模式属于结构型模式，它创建了对象组的树形结构。
 * @优点: 组合模式可以清楚地定义分层次的复杂对象，
 * 表示对象的全部或部分层次，它让客户端忽略了层次的差异，
 * 方便对整个层次结构进行控制。
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
