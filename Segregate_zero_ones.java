import java.util.Scanner;

public class Segregate_zero_ones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of the array in 0's and 1's form : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int countZeros = 0;
        // counting the zero in the array 
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                countZeros++;
            }
        }

        for(int i=0;i<countZeros;i++){
            arr[i] = 0;
        }
        for(int i=countZeros;i<arr.length;i++){
            arr[i] = 1;
        }

        // printing the final array :
        for (int i : arr) {
            System.out.print(i+" ");
        }
        sc.close();
    }
}
