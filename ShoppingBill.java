import java.util.Scanner;

public class ShoppingBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] price = new int[10];
        int total = 0;

        System.out.println("Enter Prices of 10 Products: ");
        for (int i = 0; i < price.length; i++) {
            price[i] = sc.nextInt();
            total = total + price[i];
        }
        System.out.println("Total Bill: " + total);
    }
}
