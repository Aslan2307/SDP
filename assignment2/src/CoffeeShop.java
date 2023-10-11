import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Coffee Shop!");

        System.out.println("Select a coffee type:");
        System.out.println("1. Latte");
        System.out.println("2. Cappuccino");

        int coffeeChoice = scanner.nextInt();
        Coffee coffee = null;

        if (coffeeChoice == 1) {
            coffee = new Latte();
        } else if (coffeeChoice == 2) {
            coffee = new Cappuccino();
        } else {
            System.out.println("Invalid coffee selection. Please choose again.");
            return;
        }

        System.out.println("Do you want to add seasonings?");
        System.out.println("1. Sugar");
        System.out.println("2. Milk");
        System.out.println("3. Caramel");
        System.out.println("4. None");

        int seasoningChoice = scanner.nextInt();

        if (seasoningChoice == 1) {
            coffee = new SugarDecorator(coffee);
        } else if (seasoningChoice == 2) {
            coffee = new MilkDecorator(coffee);
        } else if (seasoningChoice == 3) {
            coffee = new CaramelDecorator(coffee);
        } else if (seasoningChoice != 4) {
            System.out.println("Invalid seasoning selection. Coffee will be served without seasonings.");
        }

        System.out.println("Your coffee order: " + coffee.getDescription());
        System.out.println("Total cost: $" + coffee.cost());
    }
}