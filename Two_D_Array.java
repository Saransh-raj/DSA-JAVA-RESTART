public class Two_D_Array {
    public static void main(String[] args){
        // creating 2D array in java and print default array element
        int[] [] arr = new int[4] [4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
