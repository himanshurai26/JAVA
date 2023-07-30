import java.util.Scanner;

public class AddNumber {
    //how to add two number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the two Integer to calculate their sum");

        int a  = sc.nextInt();
        System.out.println("first num is " + a);

        int b = sc.nextInt();
        System.out.println("Second number is " + b);

        int c = a + b;
        System.out.println("The sum of Integers is " + c);
    }
}
