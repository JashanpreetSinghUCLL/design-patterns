package be.ucll.crafsmanship.command.gamecontroller;

public class CrouchCommand implements Command {
    private final Receiver receiver;

    public CrouchCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.actionCircle();
    }
}
