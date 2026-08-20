import java.util.Scanner;
public class AssignmentOperatorsExample {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int num = sc.nextInt();

        int value = num;
        System.out.println("\nAfter '=' Assignment : " + value);

        value += 10;
        System.out.println("After '+=' (Add 10): " + value);

        value -= 5;
        System.out.println("After '-=' (Subtract 5): " + value);

        value *= 2;
        System.out.println("After '*=' (Multiply by 2): " + value);

        value /= 3;
        System.out.println("After '/=' (Divide by 3): " + value);

        value %= 4;
        System.out.println("After '%=' (Modulus by 4): " + value);

        sc.close();
    }
}