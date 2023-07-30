import java.util.Scanner;

public class ReverseNuber {
    public static void main(String[] args) {
        int num;
        int reverse = 0;

        System.out.println("Enter the number to reverse");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        while (num !=0){
            reverse = reverse * 10;
            reverse = reverse + num%10;
            num = num/10;
        }

        System.out.println("Reverse of entered number is " + reverse);
    }
}
