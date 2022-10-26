package action.interpreter;

/**
 * @定义: 给定一个语言，定义它的文法表示，并定义一个解释器，这个解释器使用该标识来解释语言中的句子。
 * @优点: 易于改变和扩展文法，由于在解释器模式中使用类来表示语言的文法规则，
 * 因此可以通过继承等机制来改变或扩展文法。
 * 每一条文法规则都可以表示为一个类，因此可以方便地实现一个简单的语言；
 * 实现文法较为容易，在抽象语法树中每一个表达式节点类的实现方式都是相似的，这些类的代码编写都不会特别复杂；
 * 增加新的解释表达式较为方便，如果用户需要增加新的解释表达式只需要对应增加一个新的终结符表达式或非终结符表达式类，
 * 原有表达式类代码无须修改，符合 "开闭原则"。
 * @缺点: 对于复杂文法难以维护，在解释器模式中，每一条规则至少需要定义一个类，
 * 因此如果一个语言包含太多文法规则，类的个数将会急剧增加，导致系统难以管理和维护；
 * 执行效率较低，由于在解释器模式中使用了大量的循环和递归调用，
 * 因此在解释较为复杂的句子时其速度很慢，而且代码的调试过程也比较麻烦。
 */
public class Test {
    public static void main(String[] args) {
        Context context = new Context();
        Variable a = new Variable("a");
        Variable b = new Variable("b");
        Variable c = new Variable("c");
        Variable d = new Variable("d");
        Variable e = new Variable("e");
        context.assign(a, 1);
        context.assign(b, 2);
        context.assign(c, 3);
        context.assign(d, 4);
        context.assign(e, 5);
        Expression expression = new Minus(new Plus(new Plus(new Plus(a, b), c), d), e);
        System.out.println(expression + "= " + expression.interpret(context));
    }
}
