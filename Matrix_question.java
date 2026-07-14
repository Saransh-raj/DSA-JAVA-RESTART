import java.util.*;
public class Matrix_question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] matrix = new int[n][n];


        int topRow = 0, bottomRow = n-1, leftCol = 0, rightCol = n-1;

        int curr = 1;

        while(curr<=(n*n)){
            // topRow -> leftCol to rightCol
            for(int j=leftCol;j<=rightCol;j++){
                matrix[topRow][j] = curr;
                curr++;
            }
            topRow++;

            // rightCol -> topRow to bottomRow
            for(int i=topRow;i<=bottomRow;i++){
                matrix[i][rightCol] = curr;
                curr++;
            }
            rightCol--;

            // bottomRow -> rightCol to leftCol
            for(int j=rightCol;j>=leftCol;j--){
                matrix[bottomRow][j] = curr;
                curr++;
            }
            bottomRow--;

            // leftCol -> bottomRow to topRow
            for(int i=bottomRow;i>=topRow;i--){
                matrix[i][leftCol] = curr;
                curr++;
            }
            leftCol++;

        }

        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
