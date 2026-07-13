import java.util.*;
public class Rotate_matrix90degree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        int row = sc.nextInt();
        System.out.println("Enter number of columns : ");
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];

        System.out.println("Enter "+row*col+" elements");

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        // first we need to transpose the matrix then rotate 
        // transpose code :-
        int[][] transpose = new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                transpose[j][i] = matrix[i][j];
            }
        }

        // after transposing the matrix became :- 
        System.out.println("After transposing matrix :- ");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }

        // now rotate the matrix by 90 degree :-
        for(int i=0;i<col;i++){
             int left = 0; int right = row - 1;
             while(left<right){
             int temp = transpose[i][left];
             transpose[i][left] = transpose[i][right];
             transpose[i][right] = temp;

             left++;
             right--;
            }
        }

        // printing the rotated matrix by 90 degree
        System.out.println("After rotating 90 degree matrix became :- ");
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
