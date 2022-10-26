package action.iterator;

/**
 * @定义: 提供一个对象来顺序访问聚合对象中的一系列数据，而不暴露聚合对象的内部表示。
 * 当我们在使用JAVA开发的时候，想使用迭代器模式的话，
 * 只要让我们自己定义的容器类实现java.util.Iterable
 * 并实现其中的iterator()方法使其返回一个 java.util.Iterator 的实现类就可以了。
 * @优点: 它支持以不同的方式遍历一个聚合对象，在同一个聚合对象上可以定义多种遍历方式。
 * 在迭代器模式中只需要用一个不同的迭代器来替换原有迭代器即可改变遍历算法，
 * 我们也可以自己定义迭代器的子类以支持新的遍历方式。
 * 迭代器简化了聚合类。由于引入了迭代器，在原有的聚合对象中不需要再自行提供数据遍历等方法，
 * 这样可以简化聚合类的设计。
 * @缺点: 增加了类的个数，这在一定程度上增加了系统的复杂性。
 */
public class Test {
    public static void main(String[] args) {
        StudentService studentService = new StudentServiceImpl();
        studentService.addStudent(new Student("张三", 18));
        studentService.addStudent(new Student("李四", 20));
        studentService.addStudent(new Student("王五", 22));
        studentService.addStudent(new Student("老六", 16));
        studentService.addStudent(new Student("小七", 17));
        Iterator<Student> iterator = studentService.getIterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
    }
}
