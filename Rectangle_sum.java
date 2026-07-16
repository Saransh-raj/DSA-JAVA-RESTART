import java.util.Scanner;

public class Rectangle_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row of an array : ");
        int row = sc.nextInt();
        System.out.println("Enter column of an array : ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter "+row*col+" element");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter co-ordinate L1 and R1: ");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();

        System.out.println("Enter co-ordinate L2 and R2: ");
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        int sum = 0;

        for(int i=l1;i<=l2;i++){
            for(int j=r1;j<=r2;j++){
                sum += arr[i][j];
            }
        }

        System.out.println(sum);
        sc.close();
    }
}
