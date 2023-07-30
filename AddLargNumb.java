import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class AddLargNumb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first Large Number");
        String  number1 = sc.nextLine();

        System.out.println("Enter the second Large Number");

        String number2 = sc.nextLine();

        BigInteger first = new BigInteger(number1);
        BigInteger second = new BigInteger(number2);

        BigInteger sum = first.add(second);

        System.out.println("Result of addition = " + sum);


    }
}
