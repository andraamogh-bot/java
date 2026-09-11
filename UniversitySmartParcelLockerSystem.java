import java.util.Scanner;
public class UniversitySmartParcelLockerSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Parcel ID: ");
        int parcelId = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Recipient Name: ");
        String recipientname = sc.nextLine();

        System.out.println("Enter Mobile Number: ");
        long mobilenumber = sc.nextLong();
        sc.nextLine();

        System.out.println("Enter Parcel Size (S / M / L): ");
        String size = sc.nextLine();

        System.out.println("Enter Parcel Weight (in kgs): ");
        double weight = sc.nextDouble();

        System.out.println("Express Delivery? (True / False): ");
        boolean expressdelivery = sc.nextBoolean();

        String locker = "";
        if (size.equals("S")) {
            locker = "LOCKER A";
        } else if (size.equals("M")) {
            locker = "LOCKER B";
        } else if (size.equals("L")) {
            locker = "LOCKER C";
        }

        double fee = 0;
        if (expressdelivery == true) {
            fee = weight * 40;
        } else if (expressdelivery == false) {
            fee = weight * 25;
        }

        int pickupCode = parcelId + 5000;

        System.out.println("--------------- Receipt ---------------");
        System.out.println("Parcel ID: " + parcelId);
        System.out.println("Recipient Name: " + recipientname);
        System.out.println("Mobile Number: " + mobilenumber);
        System.out.println("Parcel Size: " + size);
        System.out.println("Locker Assigned: " + locker);
        System.out.println("Parcel Weight: " + weight);
        System.out.println("Express Service: " + expressdelivery);
        System.out.println("Storage Fee: " + fee);
        System.out.println("Pickup Code: " + pickupCode);
    }
}
