import java.util.*;

public class Linear_search {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" elements : ");
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target element : ");
        int target = sc.nextInt();

        // searching
        int ans = -1;
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                flag = true;
                ans = i;
                break;
            }
        }
        if(flag){
            System.out.println("Element present at index : "+ans);
        }else{
            System.out.println("Element not present :(");
        }

        sc.close();
    }
}
