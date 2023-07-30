import java.util.Scanner;

public class Factorial {
    //find factorial for given number

    public static void main(String[] args) {
        int num, i, fact = 1;


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to calculate factorial ");
        num = sc.nextInt();

        if (num < 0) {
            System.out.println("Number is Negative.....");
        } else {
            for (i = 1; i <= num; i++) {
                fact = fact * i;

                System.out.println("Factorial of + " + num  + " is = "+ fact);
            }
        }


    }
}
