public class Check_arr_sort {
    public static void main(String[] args) {
        int[] arr = {2,5,9,7,6,3,4};

        // check the array is sort or not
        boolean flag = true;
        for(int i=1;i<arr.length;i++){
            if(arr[i] < arr[i-1]){
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}