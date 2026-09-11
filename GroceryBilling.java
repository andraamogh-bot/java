import java.util.Scanner;
public class GroceryBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int priceperkg = 60;
        System.out.println("Enter Customer Name: ");
        String customername = sc.nextLine();

        System.out.println("Enter Quantity Purchased (kg): ");
        int quantity = sc.nextInt();

        int totalbill = quantity * priceperkg;

        System.out.println("\n==================================");
        System.out.println("     GROCERY STORE BILL            ");
        System.out.println("Customer Name: " + customername);
        System.out.println("Rice Price per Kg: ₹" + priceperkg);
        System.out.println("Total Bill: ₹" + totalbill);
        System.out.println("===================================");

    }
}
