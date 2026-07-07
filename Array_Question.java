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

        //find last occurrences of the element x
        int[] ara = {1,2,3,4,1,5,4,2,1,4,4};
        System.out.println("Enter target : ");
        int x = sc.nextInt();
        int lastIndex = -1;
        for(int i=0;i<ara.length;i++){
            if(ara[i] == x){
                lastIndex = i;
            }
        }
        System.out.println("Last Occurrences of the element : "+x+" is "+lastIndex);

        // count the number of elements strictly  greater than the value x :-
        int[] araa = {1,2,3,4,5,9,2,5};
        int cot = 0;
        System.out.println("Enter element : ");
        int y = sc.nextInt();
        for(int i=0;i<araa.length;i++){
            if(araa[i] > y){
                cot++;
            }
        }
        System.out.println("The number of elements strictly greater than the value : "+y+ " is : "+cot);

        // check the given array is sorted or not
        int[] arra = {1,2,5,6,21,45,67,3,2,9};
        boolean check = true;
        for(int i=1;i<arra.length;i++){
            if(arra[i] < arra[i-1]){
                check = false;
                break;
            }
        }
        System.out.println(check);

        sc.close();
    }
}
