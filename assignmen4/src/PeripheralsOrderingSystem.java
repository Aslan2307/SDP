import java.util.Scanner;

public class PeripheralsOrderingSystem {
    public static void main(String[] args) {
        OrderManagementSystem orderSystem = new OrderManagementSystem();

        // Register vendors
        PeripheralVendor vendor1 = new PeripheralVendorImpl("Vendor 1");
        //PeripheralVendor vendor2 = new PeripheralVendorImpl("Vendor 2");
        orderSystem.addObserver(vendor1);
        //orderSystem.addObserver(vendor2);

        Scanner scanner = new Scanner(System.in);

        // Allow the user to choose peripherals
        while (true) {
            System.out.println("Choose a peripheral to order:");
            System.out.println("1. Keyboard");
            System.out.println("2. Mouse");
            System.out.println("3. Monitor");
            System.out.println("4. Printer");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();
            if (choice == 0) {
                break;
            }

            PeripheralFactory factory = null;
            switch (choice) {
                case 1:
                    factory = new KeyboardFactory();
                    break;
                case 2:
                    factory = new MouseFactory();
                    break;
                case 3:
                    factory = new MonitorFactory();
                    break;
                case 4:
                    factory = new PrinterFactory();
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    continue;
            }

            Peripheral peripheral = factory.createPeripheral();
            System.out.println("You ordered: " + peripheral.getModel() + " for $" + peripheral.getPrice());
            orderSystem.placeOrder(new PeripheralOrder(peripheral.getModel(), 1));
        }

        System.out.println("Thank you for using the ordering system!");
    }
}