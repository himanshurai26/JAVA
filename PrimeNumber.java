import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of prime numbers of you want");

        int num = sc.nextInt();

        if(num >= 1){
            System.out.println("First " + num + " prime  numbers are :- ");
            System.out.println(2);
        }

    }
}
