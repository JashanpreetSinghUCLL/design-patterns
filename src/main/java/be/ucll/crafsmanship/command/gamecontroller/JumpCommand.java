package be.ucll.crafsmanship.command.gamecontroller;

public class JumpCommand implements Command {
    private final Receiver receiver;

    public JumpCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.actionCross();
    }
}