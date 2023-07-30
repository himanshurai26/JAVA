import java.util.Scanner;

public class CompareStrings {
    //how to compare 2 String

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first String s1");

        String s1 = sc.nextLine();

        System.out.println("Enter the Second String s2");
        String s2 = sc.nextLine();

        if(s1.compareTo(s2) > 0){
            System.out.println( s1  + "first String is greater than the second String..");
        } else if (s1.compareTo(s2) < 0)
            {
                System.out.println(s2 + " Second string is grater than first String ");
            }
            else
            {
                System.out.println( s1 + "=" + s2 + "Both String are equal");
            }


    }
}
