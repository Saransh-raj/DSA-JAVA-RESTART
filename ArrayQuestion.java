import java.util.*;
public class ArrayQuestion {

    // swap method
    static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;

        // we can also do swapping with using arithimetic operator without using temperory variable
        // a = a + b;
        // b = a - b;
        // a = a - b;

        System.out.println(a+" , "+b);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // return the first value that is repeating in this array if no value is being repeated , return -1
        int[] arr = {1,5,3,4,6,3,4};

        int result = -1;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    result = arr[i];
                    break;
                }
            }
            if(result != -1) break; // stop outer loop once found
        }
        System.out.println(result);

        // swapping a and b using swap method
        int a = 10;
        int b = 20;
        swap(a, b); // swap method call


        // Reverse the array consisting of an integer into ans[] array
        int[] array = {1,2,3,4,5};
        int[] ans = new int[array.length];
        int j = 0;
        for(int i=array.length-1;i>=0;i--){
            ans[j++] = array[i];
        }
        for(int num : ans){
            System.out.print(num+" ");
        }
        sc.close();
    }
}
