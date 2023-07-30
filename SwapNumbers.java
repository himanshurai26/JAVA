import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first num");

        a = sc.nextInt();

        System.out.println("The first NUmber is = " + a );

        System.out.println("Enter the Second Number ");
        b = sc.nextInt();

        System.out.println("The second number is " + b);

        System.out.println("*************************************");

        System.out.println("After Swapping Number ");

        int temp = a;
        a = b ;
        b  = temp;

        System.out.println("The first nubmer is  " + a);
        System.out.println("the Second Number is = " + b);
    }
}
