import java.util.Scanner;
public class TwoDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // syntax od 2D array in java
        int[][] arr = {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}};
        

        // printing the 2d array
        for(int i=0;i<arr.length;i++){ // row 
            for (int j = 0; j < arr[i].length; j++) {   // column
                System.out.print    (arr[i][j]+ " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
