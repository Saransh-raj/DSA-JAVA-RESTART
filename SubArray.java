public class SubArray {
    public static void main(String[] args) {
        // array - {2,4,6,8,10};
        // subarray :- {2} {2,4} {2,4,6} {2,4,6,8} {2,4,6,8,10}
                    // {4} {4,6} {4,6,8} {4,6,8,10}
                    // {6} {6,8} {6,8,10}
                    // {8} {8,10}
                    // {10}
        int totalSubArray = 0;
        int[] arr = {2,4,6,8,10};
        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){
                int end = j;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                }
                totalSubArray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Sub Arrays : "+totalSubArray);
    }
}
