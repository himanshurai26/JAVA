import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number to check odd or even");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println(num + " is Even Number");
        }else {
            System.out.println(num + " is Odd Number");
        }
    }
}
