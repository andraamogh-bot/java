import java.util.Scanner;
public class SubjectMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Marks in First Subject: ");
        int marks1 = sc.nextInt();

        System.out.println("Enter Marks in Second Subject: ");
        int marks2 = sc.nextInt();

        System.out.println("Enter Marks in Third Subject: ");
        int marks3 = sc.nextInt();

        int totalMarks = marks1 + marks2 + marks3;
        double averageMarks = totalMarks / 3.0;

        System.out.println("--------------- Result ---------------");
        System.out.println("Student Name: " + name);
        System.out.println("Marks in First Subject: " + marks1);
        System.out.println("Marks in Second Subject: " + marks2);
        System.out.println("Marks in Third Subject: " + marks3);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("--------------------------------------");


    }
}
