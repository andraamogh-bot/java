import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] salary = new int[5];
        System.out.println("Enter Salaries of 5 Employees: ");
        for (int i = 0; i < salary.length; i++) {
            salary[i] = sc.nextInt();
        }

        int highest = salary[0];
        for (int i = 1; i < salary.length; i++) {
            if (salary[i] > highest) {
                highest = salary[i];
            }
        }
        System.out.println("Highest Salary = " + highest);
    }
}
