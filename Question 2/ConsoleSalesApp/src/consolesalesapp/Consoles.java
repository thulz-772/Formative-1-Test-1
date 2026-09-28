package consolesalesapp;

// Required abstract class created with Constructor, Variables and Methods
public abstract class Consoles implements IConsoles {

    // Variables to store console device type, store name, total amount
    private String consoleType;
    private String storeName;
    private int totalSales;

    // Constructor that accepts console type, store name, total amount as parameters
    public Consoles(String consoleType, String storeName, int totalSales) {
        this.consoleType = consoleType;
        this.storeName = storeName;
        this.totalSales = totalSales;
    }

    // Methods to get console type, store name, total amount
    @Override
    public String getConsoleType() {
        return consoleType;
    }

    @Override
    public String getStore() {
        return storeName;
    }

    @Override
    public int getTotalSales() {
        return totalSales;
    }
}