import java.util.*;

class Q12 {
    public static void main(String[] args) {
        Integer[] arr = {5,2,9,1,3};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}