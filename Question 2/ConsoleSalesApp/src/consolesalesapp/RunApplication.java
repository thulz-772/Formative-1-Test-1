package consolesalesapp;

import java.util.Scanner;

public class RunApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display menu for console selection
        System.out.println("Select the console type");
        System.out.println("1) PS5");
        System.out.println("2) XBOX");
        System.out.println("3) SWITCH");

        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String consoleType = "";

        switch(choice) {
            case 1: consoleType = "PS5"; break;
            case 2: consoleType = "XBOX"; break;
            case 3: consoleType = "SWITCH"; break;
            default: consoleType = "UNKNOWN"; break;
        }

        System.out.print("Enter the store: ");
        String storeName = scanner.nextLine();

        System.out.print("Enter the total sales of " + consoleType + " consoles for " + storeName + ":");
        int totalSales = scanner.nextInt();

        // Call the ConsoleSales class
        ConsoleSales sales = new ConsoleSales(consoleType, storeName, totalSales);

        // Call printReport method
        sales.printReport();

        scanner.close();
    }
}