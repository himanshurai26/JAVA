import javax.security.sasl.SaslClient;
import java.math.BigInteger;
import java.util.Scanner;
// calculate factorial for large number
public class BigFactorial {
    public static void main(String[] args) {
        int num, i;

        BigInteger inc = new BigInteger("1");
        BigInteger fact = new BigInteger("1");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an Integer");

        num = sc.nextInt();

        for(i = 1; i <= num; i++){
            fact = fact.multiply(inc);
        inc = inc.add(BigInteger.ONE);
        }

        System.out.println(num + "! = " + fact);
    }
}
