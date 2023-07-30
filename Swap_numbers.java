import java.util.Scanner;

public class Swap_numbers {
    // How to swap 2 no without using 3rd variables;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Before Swaping");

        System.out.println(" a =");
        int a = sc.nextInt();


        System.out.println("a = " + a );

        System.out.println("b = ");
        int b = sc.nextInt();
        System.out.println("b = " + b);

        System.out.println("After swaping ");

        a = a + b;
        b = a - b;
        a = a -b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
