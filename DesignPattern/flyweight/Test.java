package flyweight;

import java.util.Random;

/**
 * 运用共享技术来有效地支持大量细粒度对象的复用。
 * 它通过共享已经存在的对象来大幅度减少需要创建的对象数量、避免大量相似对象的开销，
 * 从而提高系统资源的利用率。
 */
public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        String[] colors = new String[]{"红", "绿", "蓝"};
        String[] shapes = new String[]{"I", "L", "O"};
        BoxFactory boxFactory = BoxFactory.getInstance();
        for (int i = 0; i < 20; i++) {
            Box box = boxFactory.getBox(shapes[random.nextInt(shapes.length)]);
            box.display(colors[random.nextInt(colors.length)]);
        }


    }
}
