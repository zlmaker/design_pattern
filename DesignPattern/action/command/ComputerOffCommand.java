package action.command;

public class ComputerOffCommand implements Command {
    private Computer computer;

    public ComputerOffCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.close();
    }
}
