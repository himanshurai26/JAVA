import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String ");

        String str = sc.nextLine();
        System.out.println("String is " + str);

        System.out.println("Enter a Number ");

        int num = sc.nextInt();
        System.out.println("the number is " + num);

        System.out.println("enter a float");
        float fl = sc.nextFloat();
        System.out.println("Float number is " + fl);

        System.out.println("Enter a  condition");

        boolean condi = sc.nextBoolean();
        System.out.println("Boolean is "+ condi);
    }
}
