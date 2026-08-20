import java.util.Scanner;
public class LockerRouter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int longSide = sc.nextInt();
        double weight = sc.nextDouble();
        char tier;
        if (longSide <= 20 && weight <= 2.0) tier = 'S';
        else if (longSide <= 40 && weight <= 5.0) tier = 'M';
        else if (longSide <= 60 && weight <= 10.0) tier = 'L';
        else tier = 'X';

        String zone = "", note = "";
        switch (tier) {
            case 'S':
                zone = "Zone A";
                note = "Cubby Shelf";
                break;
            case 'M':
                zone = "Zone B";
                note = "Standard Locker";
                break;
            case 'L':
                zone = "Zone C";
                note = "Tall Locker";
                break;
            case 'X':
                zone = "Counter";
                note = "Manual Handling";
                break;                             
        }
        System.out.printf("Tier %c -> %s (%s)%n", tier, zone, note);
    }
}
