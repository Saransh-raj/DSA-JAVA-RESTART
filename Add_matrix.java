import java.util.*;
public class Add_matrix {
    public static void main(String[] args) {
        // Scanner Class
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

        // sum array
        int[][] sum = new int[r1][c1];

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

        // adding the element
        System.out.println("After adding elements of the matrix is :- ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                sum[i][j] = matrix_1[i][j] + matrix_2[i][j];
            }
        }

        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print(sum[i][j]+ " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
