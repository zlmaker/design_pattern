package action.command;

/**
 * @定义: 将一个请求封装为一个对象，使发出请求的责任和执行请求的责任分割开。
 * 这样两者之间通过命令对象进行沟通，这样方便将命令对象进行存储、传递、调用、增加与管理。
 * @优点: 降低系统的耦合度、增加或删除命令非常方便、可以实现宏命令
 * (命令模式可以与组合模式结合，将多个命令装配成一个组合命令，即宏命令。)
 * @缺点: 导致某些系统有过多的具体命令类，系统结构更加复杂
 */
public class Test {
    public static void main(String[] args) {

        // 三个家电
        Light light = new Light();
        Door door = new Door();
        Computer computer = new Computer();

        // 一个控制器，假设是我们的app主界面

        ControlPanel controlPanel = new ControlPanel();
        // 为每个按钮设置功能
        controlPanel.setCommand(0, new LightOnCommand(light));
        controlPanel.setCommand(1, new LightOffCommand(light));
        controlPanel.setCommand(2, new ComputerOnCommand(computer));
        controlPanel.setCommand(3, new ComputerOffCommand(computer));
        controlPanel.setCommand(4, new DoorOnCommand(door));
        controlPanel.setCommand(5, new DoorOffCommand(door));

        // 模拟点击
        controlPanel.keyPressed(0);
        controlPanel.keyPressed(2);
        controlPanel.keyPressed(3);
        controlPanel.keyPressed(4);
        controlPanel.keyPressed(5);
        controlPanel.keyPressed(8);// 这个没有指定，但是不会出任何问题，我们的NoCommand的功劳

        // 满足客户想要快速执行的功能
        QuickCommand quickCommand = new QuickCommand(new Command[]{
                new DoorOffCommand(door), new LightOffCommand(light), new ComputerOnCommand(computer)
        });
        System.out.println("****点击一键搞定按钮****");
        controlPanel.setCommand(9, quickCommand);
        controlPanel.keyPressed(9);
    }
}
