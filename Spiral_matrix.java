import java.util.Scanner;
public class Spiral_matrix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter No of row of matrix :- ");
        int r = sc.nextInt();
        System.out.println("Enter No of column of matrix :- ");
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        int topRow = 0, bottomRow = r-1, leftCol = 0, rightCol = c-1;

        int totalElement = 0;

        while(totalElement<(r*c)){
            // topRow -> leftCol to rightCol
            for(int j=leftCol;j<=rightCol;j++){
                System.out.print(matrix[topRow][j] +" ");
                totalElement++;
            }
            topRow++;

            // rightCol -> topRow to bottomRow
            for(int i=topRow;i<=bottomRow;i++){
                System.out.print(matrix[i][rightCol]+" ");
                totalElement++;
            }
            rightCol--;

            // bottomRow -> rightCol to leftCol
            for(int j=rightCol;j>=leftCol;j--){
                System.out.print(matrix[bottomRow][j]+" ");
                totalElement++;
            }
            bottomRow--;

            // leftCol -> bottomRow to topRow
            for(int i=bottomRow;i>=topRow;i--){
                System.out.print(matrix[i][leftCol]+" ");
                totalElement++;
            }
            leftCol++;

        }

        

        sc.close();
    }
}