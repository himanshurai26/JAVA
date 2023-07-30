import java.util.Scanner;

public class LargetOfTreeNumbers {
    //find largest of three numbers
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three Numbers");


        int a  = sc.nextInt();

        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a > b && a > c){
            System.out.println("First Number is Larges " + a );
        }else if(b > a && b > c){
            System.out.println("Second Number is largets" + b);

        }else if(c > a && c > b){
            System.out.println("Third Number is largest " + c);
        }
        else {
            System.out.println("Enter valid Number");
        }
    }
}
