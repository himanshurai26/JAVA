import java.util.Scanner;

public class IFElse {
    public static void main(String[] args) {
        int marksObtaine;
        int passingMarks = 34;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Marks Obtain by you");
        marksObtaine = sc.nextInt();

        if(marksObtaine >= passingMarks){
            System.out.println("You passed the exam. ");
        }else {
            System.out.println("You failed the exams");
        }


    }
}
