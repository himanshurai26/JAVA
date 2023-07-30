import java.util.Scanner;

public class BreakContinuewhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Enter an Integer");
            int num = sc.nextInt();

            if(num != 0){
                System.out.println("You enterd " + num);
                continue;
            }else{
                break;
            }

        }
    }
}
