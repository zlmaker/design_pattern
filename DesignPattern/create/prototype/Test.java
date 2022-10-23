package create.prototype;

/**
 * 用一个已经创建的实例作为原型，通过复制该原型对象来创建一个和原型对象相同的新对象。
 */
public class Test {
    public static void main(String[] args) {
        // 相当于还没有填名字的奖状
        Citation citation = new Citation();
        Citation citation1 = citation.clone();
        // 填上获奖者的姓名
        citation1.setName("张三");
        citation1.show();

    }
}
