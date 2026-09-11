import java.util.Scanner;
public class SmartLockerAvailability {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Locker Number: ");
        int lockernumber = sc.nextInt();

        if (lockernumber >= 1 && lockernumber <= 20) {
            System.out.println("Locker Available");
        } else {
            System.out.println("Locker Unavailable");
        }
        sc.close();
    }
}
