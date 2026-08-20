import java.util.Scanner;
public class AccountBalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the PIN: ");
        int pin = sc.nextInt();

        int balance = 10000;
        
        balance += 3500;
        System.out.println("\nPrevious Balance: 10000");
        System.out.println("Deposit Amount: 3500");
        System.out.println("Current Balance: " + balance);
    }
}
