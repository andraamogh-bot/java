import java.util.Scanner;
public class ProductPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Product Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Product Price per Unit: ");
        double price = sc.nextDouble();
        System.out.println("Enter Product Quantity: ");
        int quantity = sc.nextInt();
        System.out.println("Product Name: " + name);
        System.out.println("Product Quantity: " + quantity);
        System.out.println("Total Price: " + price * quantity);


    }
}
