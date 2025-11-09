package be.ucll.crafsmanship.command.gamecontroller;

public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();

        // Create commands
        Command jumpCommand = new JumpCommand(receiver);
        Command crouchCommand = new CrouchCommand(receiver);
        Command swapWeaponCommand = new SwapWeaponCommand(receiver);
        Command useWeaponCommand = new UseWeaponCommand(receiver);

        // Create controller
        PS5Controller controller = new PS5Controller();

        // Set initial button mappings
        controller.setCrossCommand(jumpCommand);
        controller.setTriangleCommand(swapWeaponCommand);
        controller.setSquareCommand(useWeaponCommand);
        controller.setCircleCommand(crouchCommand);

        System.out.println("=== Initial Button Mappings ===");
        System.out.println("Cross (X): Jump");
        System.out.println("Triangle (▲): Swap Weapon");
        System.out.println("Square (□): Use Weapon");
        System.out.println("Circle (○): Crouch");

        // Simulate button presses
        System.out.println("\n=== Testing Button Presses ===");
        controller.pressCross();
        controller.pressTriangle();
        controller.pressSquare();
        controller.pressCircle();

        // Demonstrate re-mapping: Change Cross button from Jump to Crouch
        System.out.println("\n=== Re-mapping Cross Button from Jump to Crouch ===");
        controller.setCrossCommand(crouchCommand);

        System.out.println("Cross (X) now mapped to: Crouch");

        // Test the re-mapped button
        System.out.println("\n=== Testing Re-mapped Button ===");
        controller.pressCross();

        // Another re-mapping example: Change Triangle button from Swap Weapon to Use Weapon
        System.out.println("\n=== Re-mapping Triangle Button from Swap Weapon to Use Weapon ===");
        controller.setTriangleCommand(useWeaponCommand);

        System.out.println("Triangle (▲) now mapped to: Use Weapon");

        // Test all buttons again
        System.out.println("\n=== Testing All Buttons After Re-mapping ===");
        controller.pressCross();
        controller.pressTriangle();
        controller.pressSquare();
        controller.pressCircle();
    }
}
