import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class BreakWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){

            System.out.println("Enter Integer");
            int num = sc.nextInt();

            if(num == 0){
                break;
            }

            System.out.println("You entered " + num);
        }
    }
}
