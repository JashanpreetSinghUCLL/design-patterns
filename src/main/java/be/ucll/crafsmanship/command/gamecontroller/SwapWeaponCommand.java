package be.ucll.crafsmanship.command.gamecontroller;

public class SwapWeaponCommand implements Command {
    private final Receiver receiver;

    public SwapWeaponCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.actionTriangle();
    }
}
