import java.util.Scanner;

public class SubStringsOfAString {
    public static void main(String[] args) {
        String str, sub;
        int i, c, length;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String to print its all substring .......");

        str = sc.nextLine();

        length = str.length();

        System.out.println("Substrings of \"" + str + "\" are = ");

        for(c = 0; c < length; c++)
        {
            for(i = 1; i <= length-c ; i++){
                sub = str.substring(c, c+1);
                System.out.println(sub);
            }
        }

    }
}
