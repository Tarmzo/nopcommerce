package Basics;

import java.util.Scanner;

public class RunTotalPrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CartItems cart = new CartItems();

        System.out.println("Enter items in the format 'name price' (type 'done' to finish):");

        while (true) {
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("done")) {
                break;
            }
            String[] parts = line.split(" ");
            if (parts.length != 2) {
                System.out.println("Invalid input. Please enter in the format 'name price'.");
                continue;
            }
            String name = parts[0];
            double price;
            try {
                price = Double.parseDouble(parts[1]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid price. Please enter a valid number.");
                continue;
            }
            cart.addItem(new ComputerItems(name, price));
        }

        cart.printItems();
        double total = cart.calculateTotal();
        System.out.println("Total Price: $" + total);

        System.out.println("Enter the expected total price to validate:");
        double expectedTotal;
        try {
            expectedTotal = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.close();
            return;
        }

        if (cart.validateTotal(expectedTotal)) {
            System.out.println("The total price is correct.");
        } else {
            System.out.println("The total price is incorrect.");
        }
        scanner.close();
    }
}