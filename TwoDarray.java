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
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }


        // 2D array another syntax and taking user input
        System.out.println("Enter row : ");
        int row = sc.nextInt();
        System.out.println("Enter column : ");
        int col = sc.nextInt();
        int[][] array = new int[row][col];

        // taking user input in 2D array
        System.out.println("Enter "+row*col+" elements");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        
        // printing the elements of the 2D array
        System.out.println("You enter elements:- ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
