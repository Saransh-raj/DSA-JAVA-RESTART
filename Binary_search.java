import java.util.*;
public class Binary_search {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" elements : ");
        System.out.println("Make sure elements are in sorted order");
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target element : ");
        int target = sc.nextInt();

        int low = 0;
        int high = arr.length-1;
        int ans = -1;

        while(low<=high){
            int mid = (low + high) / 2;
            if(arr[mid] == target){
                ans = mid;
                break;
            }else if(target > arr[mid]){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        if(ans >= 0){
            System.out.println("Element present at index "+ans);
        }else{
            System.out.println("Element not present :( ");
        }

        sc.close();
    }
}
