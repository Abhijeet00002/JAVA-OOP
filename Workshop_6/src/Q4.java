import java.util.*;

class Q4 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");

        for(String c : colors)
            System.out.println(c);

        System.out.println(colors.contains("Red"));

        Collections.shuffle(colors);
        System.out.println(colors);

        Collections.sort(colors);
        System.out.println(colors);
    }
}
