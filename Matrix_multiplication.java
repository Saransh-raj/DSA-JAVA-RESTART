import java.util.Scanner;
public class Matrix_multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // matrix 1 data input :- 
        System.out.println("Enter No of row of matrix 1 :- ");
        int r1 = sc.nextInt();
        System.out.println("Enter No of column of matrix 1 :- ");
        int c1 = sc.nextInt();
        int[][] matrix_1 = new int[r1][c1];

        // matrix 2 data input :-
        System.out.println("Enter No of row of matrix 2 :- ");
        int r2 = sc.nextInt();
        System.out.println("Enter No of column of matrix 2 :- ");
        int c2 = sc.nextInt();
        int[][] matrix_2 = new int[r2][c2];


        System.out.println("Enter "+c1*r1+" elements for matrix 1");
        // taking input of matrix 1 element
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                matrix_1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter "+c2*r2+" elements for matrix 2");
        // taking input of matrix 2 element
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                matrix_2[i][j] = sc.nextInt();
            }
        }

        // condition checking for matrix multiplication
        if (r1 != c2) {
            System.out.println("Matrix multiplication not possible! Columns of matrix 1 must equal rows of matrix 2.");
            sc.close();
            return;
        }

        int[][] mul = new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                
                for(int k=0;k<c1;k++){
                    mul[i][j] += (matrix_1[i][k] * matrix_2[k][j]);
                }
            }
        }

        System.out.println("Multiplication of both matrix is :- ");
        // printing the multiplication :-
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                System.out.print(mul[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
