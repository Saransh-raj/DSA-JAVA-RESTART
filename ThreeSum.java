import java.util.*;
public class ThreeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array element : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int ans = 0;
        int target = sc.nextInt();
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k = j+1;k<arr.length;k++){
                    if((arr[i] + arr[j] + arr[k]) == target){
                        System.out.println((arr[i]+" "+ arr[j] +" " + arr[k]));
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
