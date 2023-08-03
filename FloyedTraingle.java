import java.util.Scanner;

public class FloyedTraingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to print floyed's Traingle ..");

        int num = sc.nextInt();

        System.out.println("Floyed Traigle ......");
        int incrementNum = 1;

        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(incrementNum);
                incrementNum++;
            }

            System.out.println(" ");
        }

    }

}
