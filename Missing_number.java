import java.util.Scanner;

public class Missing_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // calculating the actual sum of the array :
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // calculating the expected sum :
        int expectedSum = n * (n + 1) / 2;
        int ans = expectedSum - sum;

        System.out.println(ans);

        sc.close();
    }
}
