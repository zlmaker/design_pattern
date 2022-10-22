package iterator;

/**
 * 提供一个对象来顺序访问聚合对象中的一系列数据，而不暴露聚合对象的内部表示。
 * 当我们在使用JAVA开发的时候，想使用迭代器模式的话，
 * 只要让我们自己定义的容器类实现java.util.Iterable
 * 并实现其中的iterator()方法使其返回一个 java.util.Iterator 的实现类就可以了。
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
