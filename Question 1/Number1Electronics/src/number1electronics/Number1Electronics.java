package number1electronics;

// Question 1 

public class Number1Electronics {

    public static void main(String[] args) {

        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};

        int[][] sales = {
            {1000, 2000, 3000}, // Cape Town
            {2000, 3000, 4000}, // Port Elizabeth
            {1500, 1100, 1200} // Pretoria
        };

        String[] consoles = {"PS5", "XBOX", "SWITCH"};

        int[] totalSalesPerCity = new int[cities.length];

        int maxSales = 0;
        String cityWithMostSales = "";
        int maxIndex = 0;

        // --- Printing results ---
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("------------------------");
        System.out.printf("%-20s %-8s %-8s %-8s%n", "", consoles[0], consoles[1], consoles[2]);
        System.out.println();

        for (int i = 0; i < sales.length; i++) {
            System.out.printf("%-20s", cities[i]);
            int cityTotal = 0;
            for (int j = 0; j < sales[i].length; j++) {
                System.out.printf("%-8d ", sales[i][j]);
                cityTotal += sales[i][j]; // calculation of totals
            }
            totalSalesPerCity[i] = cityTotal;
            System.out.println();

            // Determine city with most sales
            if (cityTotal > maxSales) {
                maxSales = cityTotal;
                cityWithMostSales = cities[i];
                maxIndex = i;
            }
        }

        // Printing totals per city
        System.out.println();
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("------------------------------------");
        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i] + "\t\t" + totalSalesPerCity[i]);
        }

        // Display city with the most sales
        System.out.println();
        System.out.println("CITY WITH THE MOST SALES: " + cityWithMostSales);
    }
}