import java.util.Arrays;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {

        // Scanner class
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int arr_size = sc.nextInt();

        int[] arr = new int[arr_size];

        System.out.println("Enter array elements");

        // for taking input in array
        for (int i = 0; i < arr_size; i++) {
            arr[i] = sc.nextInt();
        }

        // to print the array 
        for (int i = 0; i < arr_size; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

        // to check the default value of array index
        int[] ar = new int[5];
        for(int i=0;i<5;i++){
            System.out.print(ar[i]+" ");  // o/p :- [ 0 0 0 0 0 ]
        }

        System.out.println();

        // given an array print -ve element only
        int[] ele = {-7,5,-4,6,-1,2,3,-9};
        for(int i=0;i<ele.length;i++){
            if(ele[i] < 0){
                System.out.print(ele[i]+" ");
            }
        }
        System.out.println();

        // print the sum of the array element
        int[] sum_arr = {5,4,9,8,6,2,1};
        int sum = 0;
        for(int i=0;i<sum_arr.length;i++){
            sum += sum_arr[i];
        }
        System.out.println("sum = "+sum); // it print sum of the array

        // divide array element by 2
        int[] two_divide = {4,6,8,10,12,15,9};
        for(int i=0;i<two_divide.length;i++){
            two_divide[i] /= 2;
        }
        for(int i=0 ;i<two_divide.length;i++){
            System.out.print(two_divide[i]+" ");
        }

        System.out.println(); // for looking good

        // print all the product of the array element
        int prod = 1;
        int[] prod_arr = {1,2,3,4,5,6,7};
        for(int i=0;i<prod_arr.length;i++){
            prod *= prod_arr[i];
        }
        System.out.println("Prod of array element = "+prod);

        // print the maximum element of the array
        int[] max_arr = {5,7,9,12,15,14,1,6};
        int max = max_arr[0];
        for(int i=0;i<max_arr.length;i++){
            if(max_arr[i]>max){
                max = max_arr[i];
            }
        }
        System.out.println(max);

        // print the minimum element of the array
        int[] min_arr = {5,7,9,12,15,14,1,6};
        int min = min_arr[0];
        for(int i=0;i<min_arr.length;i++){
            if(min_arr[i]<min){
                min = min_arr[i];
            }
        }
        System.out.println(min);

        // shallow copy of an array
        int[] shallow = {1,2,3,4,5,6,7};
        int[] sh = shallow;
        sh[0] = 3;
        System.out.println(shallow[0]); // it print 3 instead of 1


        // Deep copy in Array
        int[] deep = {10,20,30,40,50};
        int[] de = Arrays.copyOf(deep,deep.length);
        de[1] = 90;
        System.out.println(de[1]);  // 90
        System.out.println(deep[1]); // 20

        // multiply odd index element by 2 and add 10 to even indexed elements
        int[] ara = {2,5,8,9,12,16,15,18,20};
        for(int i=0;i<ara.length;i++){
            if(i%2==0){
                ara[i] += 10;
            }else{
                ara[i] *= 2;
            }
        }
        for(int i=0;i<ara.length;i++){
            System.out.print(ara[i]+ " ");
        }

        System.out.println(); // for looking good

        // Search in array
        int[] search = {2,5,8,9,12,16,15,18,20};
        System.out.print("Enter the target element: ");
        int target = sc.nextInt();
        boolean flag = false;
        for(int i=0;i<search.length;i++){
            if(target == search[i]){
                flag = true;
                break;
            }
        }
        if(flag)    System.out.println("Element exist");
        else   System.out.println("Element not exist");

        // Two sum problem
        int[] Two_sum = {1,2,5,7,9,8,6,3,4};
        System.out.println("Enter the target element : ");
        int tar = sc.nextInt();
        for(int i=0;i<Two_sum.length;i++){
            for(int j=i+1;j<Two_sum.length;j++){
                if(Two_sum[i] + Two_sum[j] == tar){
                    System.out.println("pair exist "+Two_sum[i]+ " "+Two_sum[j]);
                    break;
                }
            }
        }

        // print the second maximum element

        int[] sec_max_ele = {2,9,3,8,6,5,4};
        int maxi = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        //calculate max
        for(int i=0;i<sec_max_ele.length;i++){
             if(sec_max_ele[i] > maxi) maxi = sec_max_ele[i];
        }

        //calculate second max
        for(int i=0;i<sec_max_ele.length;i++){
            if(sec_max_ele[i]>smax && sec_max_ele[i] != maxi)  smax = sec_max_ele[i];
        }
        System.out.println("Maximum : "+maxi);
        System.out.println("Second Maximum : "+smax);

        
        sc.close();
    }
}
