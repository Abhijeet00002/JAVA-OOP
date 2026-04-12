import java.util.*;

class Q14 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50));

        int key = 30;
        int index = Collections.binarySearch(list, key);

        if(index >= 0)
            System.out.println("Found at index: " + index);
        else
            System.out.println("Not found");
    }
}