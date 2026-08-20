import java.util.Scanner;
public class AttendanceExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Your Attendance Percentage: ");
        int percentage = sc.nextInt();

        String result = (percentage >= 75) ? "Eligible For Exam" : "Not Eligible For Exam";
        System.out.println(result);
    }
}
