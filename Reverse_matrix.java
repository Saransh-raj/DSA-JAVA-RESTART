import java.util.*;
public class Reverse_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of rows : ");
        int row = sc.nextInt();
        System.out.println("Enter no. of column : ");
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];

        System.out.println("Enter "+row*col+" elements :- ");
        // taking input in matrix
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        // Reverse each row
        for(int i=0;i<row;i++){
            int left = 0;int right = col-1;
            while(left<right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;

                left++;
                right--;
            }
        }

         // Print the reversed matrix
        System.out.println("Matrix after reversing rows:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
