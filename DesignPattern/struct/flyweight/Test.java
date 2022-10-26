package struct.flyweight;

import java.util.Random;

/**
 * @定义: 运用共享技术来有效地支持大量细粒度对象的复用。
 * 它通过共享已经存在的对象来大幅度减少需要创建的对象数量，
 * 避免大量相似对象的开销，从而提高系统资源的利用率。
 * @优点: 极大减少内存中相似或相同对象数量，节约系统资源，提供系统性能
 * @缺点: 为了使对象可以共享，需要将享元对象的部分状态外部化，分离内部状态和外部状态，使程序逻辑复杂
 */
public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        String[] colors = new String[]{"红", "绿", "蓝"};
        String[] shapes = new String[]{"I", "L", "O"};
        BoxFactory boxFactory = BoxFactory.getInstance();
        for (int i = 0; i < 20; i++) {
            // 获得箱子
            Box box = boxFactory.getBox(shapes[random.nextInt(shapes.length)]);
            // 给箱子上色，并展示
            box.display(colors[random.nextInt(colors.length)]);
        }


    }
}
