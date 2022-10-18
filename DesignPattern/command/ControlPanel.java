package command;

import java.util.Arrays;

/**
 * 将一个请求封装为一个对象，使发出请求的责任和执行请求的责任分割开。这样两者之间通过命令对象进行沟通，这样方便将命令对象进行存储、传递、调用、增加与管理。
 */
public class ControlPanel {
    private static final int CONTROL_SIZE = 9;
    private static Command[] commands = new Command[CONTROL_SIZE];

    //初始化所有按钮指向空对象
    static {
        Arrays.fill(commands, new NoCommand());
    }

    /**
     * 设置每个按钮对应的命令
     *
     * @param index
     * @param command
     */
    public void setCommand(int index, Command command) {
        commands[index] = command;
    }

    /**
     * 模拟点击按钮
     *
     * @param index
     */
    public void keyPressed(int index) {
        commands[index].execute();
    }

}
