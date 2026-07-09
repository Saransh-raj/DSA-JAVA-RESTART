public class PrefixSum {
    public static void main(String[] args) {

        // prefix sum using new array
        int[] arr = {2,1,3,4,5}; // prefix sum = {2,3,6,10,15};
        int[] pref = new int[arr.length];
        pref[0] = arr[0]; 

        for(int i=1;i<arr.length;i++){
            pref[i] = pref[i-1] + arr[i];
        }

        for(int num : pref){
            System.out.print(num +" ");
        }

        System.out.println();

        // prefix sum without using another array
        for(int i=1;i<arr.length;i++){
            arr[i] = arr[i-1] + arr[i];
        }
        
        for(int num : arr){
            System.out.print(num +" ");
        }
    }
}
