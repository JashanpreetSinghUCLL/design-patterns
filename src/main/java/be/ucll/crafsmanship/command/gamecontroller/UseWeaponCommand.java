package be.ucll.crafsmanship.command.gamecontroller;

public class UseWeaponCommand implements Command {
    private final Receiver receiver;

    public UseWeaponCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.actionSquare();
    }
}
