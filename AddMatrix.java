import java.util.Scanner;

public class AddMatrix {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of row and columns of matrix");

        int m = sc.nextInt();
        int n = sc.nextInt();

        int firstMatrix[][] = new int[m][n];
        int secondMatrix[][] = new int[m][n];
        int sum[][] = new int[m][n];

        System.out.println("Enter the element if second matrics....");

        int i, j;
        for( i = 0; i < m; i ++){
            for( j = 0; j < n; j++){

                firstMatrix[i][j] = sc.nextInt();
            }

            System.out.println("Enter the element of second matrix...");
            for( i = 0; i < m; i++){
             for( j = 0; j < n; j++){
                    secondMatrix[i][j] = sc.nextInt();
                }
            }

            for(i =0; i <m; i++){
                for(j = 0; j < n; j++)
                {
                     sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
                }

                System.out.println("Sum of entered matrics are");

                for(i = 0; i < m; i++)
                    for(j = 0; j < n; j++)
                    {
                        System.out.println(sum[i][j] + " ");
                    }
                System.out.println();
            }
        }
    }
}
