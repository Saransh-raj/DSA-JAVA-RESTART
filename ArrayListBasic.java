import java.util.ArrayList;
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

    }
}
