import java.util.ArrayList;
import java.util.Collections;
public class ArrayListBasic {
    public static void main(String[] args) {
        
        // creating the array list in java
        ArrayList<Integer> arr = new ArrayList<>();

        // adding the element into list
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        // printing the element of the array list
        System.out.println(arr.get(0));
        System.out.println(arr.get(1));
        System.out.println(arr.get(2));
        System.out.println(arr.get(3));
        System.out.println(arr.get(4));


        arr.set(2, 10); // set the value of the list at index 2 - 10
        System.out.println(arr.get(2)); // 10
        System.out.println(arr); // it will print the whole array like :- [10, 20, 10, 40, 50]

        //remove method
        arr.remove(2);
        System.out.println(arr);

        // reverse method
        Collections.reverse(arr);
        System.out.println(arr);
    }
}
