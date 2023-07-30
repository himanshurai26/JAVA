import java.util.Scanner;

public class NestedIfElse {
    //Nested loop
    public static void main(String[] args) {
        int passingMarks = 45;
char grade;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Marks");
        int ObtainMarks = sc.nextInt();

        if(ObtainMarks >= passingMarks){
            if(ObtainMarks >= 90){
              grade = 'A';
            } else if (ObtainMarks >= 80) {
               grade = 'B';
            } else if (ObtainMarks >= 60) {
                grade = 'C';
            } else if (ObtainMarks >= 45) {
                grade = 'D';
            }else {
                grade = 'E';

            }
            System.out.println("You passed the exam and your gradde is " + grade);
        }
        else {
            grade = 'F';
            System.out.println("You failed the exam and your grade is " + grade);
        }
    }
}
