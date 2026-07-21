public class Pair {
    public static void main(String[] args) {

        // pair in an array
        // {1,2,3,4,5}
        // pair :- (1,2) (1,3) (1,4) (1,5)
                // (2,3) (2,4) (2,5) 
                // (3,4) (3,5)
                // (4,5)

        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
        }
    }
}
