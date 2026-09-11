import java.util.Scanner;
public class ScholarshipEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Your Marks: ");
        int marks = sc.nextInt();

        if (marks >= 75) {
            System.out.println("Eligible for Scholarship");
        } else {
            System.out.println("Not Eligible For Scholarship");
        }
        sc.close();
    }
}
