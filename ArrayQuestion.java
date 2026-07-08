import java.util.*;
public class ArrayQuestion {
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
        sc.close();
    }
}
