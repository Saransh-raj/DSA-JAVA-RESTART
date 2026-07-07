import java.util.*;
public class Array_Question {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Rotation of array
        int[] arr = {2,3,7,9,5,4,6};
        System.out.println("Enter rotation index : ");
        int d = sc.nextInt();


        int[] result = new int[arr.length];
        int j = 0;

         // Copy from the given index to the end
        for (int i = d; i < arr.length; i++) {
            result[j] = arr[i];
            j++;
        }

         // Copy from the beginning to index - 1
        for (int i = 0; i < d; i++) {
            result[j] = arr[i];
            j++;
        }

        // Print the rotated array
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
        // count the number of occurrences of a particular element x

        int[] arrr = {1,2,3,4,1,5,4,2,1,4,4};
        int count = 0;
        System.out.println("Enter the target element : ");
        int tar = sc.nextInt();
        for(int i = 0;i<arrr.length;i++){
            if(tar == arrr[i]){
                count++;
            }
        }
        System.out.println(tar+" occur "+count+ " times");

        sc.close();
    }
}
