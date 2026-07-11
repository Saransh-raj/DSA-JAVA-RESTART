import java.util.*;
public class Transpose_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // matrix data input :- 
        System.out.println("Enter No of row of matrix :- ");
        int r = sc.nextInt();
        System.out.println("Enter No of column of matrix :- ");
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];

        System.out.println("Enter "+r*c+" elements for matrix 1");
        // taking input of matrix 1 element
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        // transpose matrix
        int[][] transpose = new int[c][r];  // swapped dimensions
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("After transposing matrix :- ");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
