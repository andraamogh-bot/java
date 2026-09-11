import java.util.Scanner;
public class LogicalOperatorsExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Age: ");
        int age = sc.nextInt();

        System.out.println("Enter Your Percentage: ");
        double percentage = sc.nextDouble();

        boolean scholarship = (age >= 18 && percentage >= 75);
        boolean admission = (age >= 18 || percentage>= 75);
        boolean notEligible = !(age >= 18);
        System.out.println("\nLogical Operator Results:");
        System.out.println("Eligible for Scholarship (Age >=18 AND Percentage >= 75): " + scholarship);
        System.out.println("Eligible for Admission (Age >=18 OR Percentage >= 75): " + admission);
        System.out.println("Not Eligible by Age (!Age >=18): " + notEligible);
        sc.close();
    }
}
