import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter fahreinheit value ");
        double fahrenheit = sc.nextDouble();

        System.out.println("hahrenheit value is " + fahrenheit);

        double celcius = (fahrenheit - 32) * 5/9;

        System.out.println(fahrenheit + " in celcius is " + celcius +"C");
    }
}
