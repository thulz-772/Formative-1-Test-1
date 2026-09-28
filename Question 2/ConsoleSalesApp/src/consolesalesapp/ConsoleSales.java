package consolesalesapp;

// Console Sales class created that extends the abstract class
public class ConsoleSales extends Consoles {

    // Constructor to accept console type, store name, total amount as parameters
    public ConsoleSales(String consoleType, String storeName, int totalSales) {
        super(consoleType, storeName, totalSales);
    }

    public void printReport() {
        System.out.println("\nCONSOLE SALES REPORT");
        System.out.println("********************");
        System.out.println("CONSOLE TYPE: " + getConsoleType());
        System.out.println("STORE: " + getStore());
        System.out.println("TOTAL SALES: " + getTotalSales());
    }
}