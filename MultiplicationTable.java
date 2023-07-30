import java.util.Scanner;

public class MultiplicationTable {
    //Print Multiplication table Program in java

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to print its Multiplication");

        int num = sc.nextInt();

        for(int i = 0; i <=num; i++ ){
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}
