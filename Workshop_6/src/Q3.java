import java.util.*;

class Q3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        int k = 2;
        Collections.rotate(list, k);

        System.out.println(list);
    }
}
