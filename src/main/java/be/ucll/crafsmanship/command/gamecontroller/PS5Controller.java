package be.ucll.crafsmanship.command.gamecontroller;

public class PS5Controller {
    private Command crossCommand;
    private Command triangleCommand;
    private Command squareCommand;
    private Command circleCommand;

    public void setCrossCommand(Command command) {
        this.crossCommand = command;
    }

    public void setTriangleCommand(Command command) {
        this.triangleCommand = command;
    }

    public void setSquareCommand(Command command) {
        this.squareCommand = command;
    }

    public void setCircleCommand(Command command) {
        this.circleCommand = command;
    }

    public void pressCross() {
        if (crossCommand != null) {
            crossCommand.execute();
        }
    }

    public void pressTriangle() {
        if (triangleCommand != null) {
            triangleCommand.execute();
        }
    }

    public void pressSquare() {
        if (squareCommand != null) {
            squareCommand.execute();
        }
    }

    public void pressCircle() {
        if (circleCommand != null) {
            circleCommand.execute();
        }
    }
}
