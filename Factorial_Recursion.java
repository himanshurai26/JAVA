import java.util.Scanner;

public class Factorial_Recursion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scn.nextInt();
        System.out.println(factorial(num));
    }
    static int  factorial(int num ){
        if(num == 1){
            return 1;
        }
       return  num * factorial(num - 1);
    }
}
