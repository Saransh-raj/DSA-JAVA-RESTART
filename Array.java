import java.util.Scanner;
public class Array {
    public static void main(String[] args) {

        // Scanner class
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int arr_size = sc.nextInt();

        int[] arr = new int[arr_size];

        System.out.println("Enter array elements");

        // for taking input in array
        for (int i = 0; i < arr_size; i++) {
            arr[i] = sc.nextInt();
        }

        // to print the array 
        for (int i = 0; i < arr_size; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

        // to check the default value of array index
        int[] ar = new int[5];
        for(int i=0;i<5;i++){
            System.out.print(ar[i]+" ");  // o/p :- [ 0 0 0 0 0 ]
        }

        System.out.println();

        // given an array print -ve element only
        int[] ele = {-7,5,-4,6,-1,2,3,-9};
        for(int i=0;i<ele.length;i++){
            if(ele[i] < 0){
                System.out.print(ele[i]+" ");
            }
        }
        System.out.println();

        // print the sum of the array element
        int[] sum_arr = {5,4,9,8,6,2,1};
        int sum = 0;
        for(int i=0;i<sum_arr.length;i++){
            sum += sum_arr[i];
        }
        System.out.println(sum); // it print sum of the array

        // divide array element by 2
        int[] two_divide = {4,6,8,10,12,15,9};
        for(int i=0;i<two_divide.length;i++){
            two_divide[i] /= 2;
        }
        for(int i=0 ;i<two_divide.length;i++){
            System.out.print(two_divide[i]+" ");
        }

        System.out.println(); // for looking good


        sc.close();
    }
}
