public class SelectionSort {
    public static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,3,8,4,2,11,9,10,3};
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int min = Integer.MAX_VALUE;
            int min_index = i;
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min = arr[j];
                    min_index = j;
                }
            }
            // now swap
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
        printArr(arr);
    }
}
