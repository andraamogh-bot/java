import java.util.Scanner;

public class MarketTrackerSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Simple parallel arrays to store produce details (Max 100 items)
        String[] produceNames = new String[100];
        double[] costPrices = new double[100];
        double[] sellingPrices = new double[100];
        double[] unitsSold = new double[100];
        
        int totalItemsCount = 0; // Tracks how many items have been added
        boolean running = true;

        System.out.println("=== Farmers' Market Price & Sales Tracker ===");

        // 1. WHILE LOOP: Keeps the daily record-entry system running
        while (running) {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Add Produce Details");
            System.out.println("2. Update Daily Prices");
            System.out.println("3. Record Sales");
            System.out.println("4. Profit Summary");
            System.out.println("5. Exit");
            
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();

            // 2. SWITCH STATEMENT: Menu and Crop selection
            switch (choice) {
                case 1:
                    // Feature 1: Add Produce Details
                    System.out.print("Enter produce name (e.g., Apple): ");
                    produceNames[totalItemsCount] = scanner.next();

                    System.out.print("Enter cost price per unit: $");
                    costPrices[totalItemsCount] = scanner.nextDouble();

                    // Set selling price equal to cost price initially
                    sellingPrices[totalItemsCount] = costPrices[totalItemsCount];
                    unitsSold[totalItemsCount] = 0; // 0 items sold at start

                    System.out.println(produceNames[totalItemsCount] + " added successfully!");
                    totalItemsCount++; // Move to next slot in array
                    break;

                case 2:
                    // Feature 2: Update Daily Prices
                    if (totalItemsCount == 0) {
                        System.out.println("No produce added yet!");
                        break;
                    }

                    // Display crop options directly
                    System.out.println("\n--- Select Crop ---");
                    for (int i = 0; i < totalItemsCount; i++) {
                        System.out.println((i + 1) + ". " + produceNames[i]);
                    }
                    System.out.print("Enter crop number: ");
                    int priceCropIndex = scanner.nextInt() - 1;

                    if (priceCropIndex >= 0 && priceCropIndex < totalItemsCount) {
                        System.out.print("Enter new daily selling price: $");
                        sellingPrices[priceCropIndex] = scanner.nextDouble();
                        System.out.println("Price updated successfully!");
                    } else {
                        System.out.println("Invalid crop selection.");
                    }
                    break;

                case 3:
                    // Feature 3: Record Sales
                    if (totalItemsCount == 0) {
                        System.out.println("No produce added yet!");
                        break;
                    }

                    // Display crop options directly
                    System.out.println("\n--- Select Crop ---");
                    for (int i = 0; i < totalItemsCount; i++) {
                        System.out.println((i + 1) + ". " + produceNames[i]);
                    }
                    System.out.print("Enter crop number: ");
                    int salesCropIndex = scanner.nextInt() - 1;

                    if (salesCropIndex >= 0 && salesCropIndex < totalItemsCount) {
                        System.out.print("Enter units sold today: ");
                        unitsSold[salesCropIndex] = unitsSold[salesCropIndex] + scanner.nextDouble();
                        System.out.println("Sales recorded successfully!");
                    } else {
                        System.out.println("Invalid crop selection.");
                    }
                    break;

                case 4:
                    // Feature 4: Profit Summary
                    if (totalItemsCount == 0) {
                        System.out.println("No data available to generate summary.");
                        break;
                    }

                    double totalRevenue = 0;
                    double totalCost = 0;

                    System.out.println("\n================ DAILY PERFORMANCE RECAP ================");
                    
                    // 3. FOR LOOP: Calculate total sales and costs
                    for (int i = 0; i < totalItemsCount; i++) {
                        double itemRevenue = sellingPrices[i] * unitsSold[i];
                        double itemCost = costPrices[i] * unitsSold[i];

                        totalRevenue = totalRevenue + itemRevenue;
                        totalCost = totalCost + itemCost;

                        System.out.println(produceNames[i] + " -> Sold: " + unitsSold[i] + " | Revenue: $" + itemRevenue);
                    }

                    double netProfit = totalRevenue - totalCost;

                    System.out.println("---------------------------------------------------------");
                    System.out.println("Total Daily Revenue : $" + totalRevenue);
                    System.out.println("Total Production Cost: $" + totalCost);

                    // 4. IF-ELSE STATEMENT: Profit or Loss status
                    if (netProfit > 0) {
                        System.out.println("Net Status          : PROFIT of $" + netProfit);
                    } else if (netProfit < 0) {
                        // Multiply by -1 to show a positive number for the loss amount
                        System.out.println("Net Status          : LOSS of $" + (netProfit * -1));
                    } else {
                        System.out.println("Net Status          : BREAK-EVEN ($0.00)");
                    }
                    System.out.println("=========================================================");
                    break;

                case 5:
                    running = false;
                    System.out.println("System exited. Have a great market day!");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }
}
