import java.util.*;

class Q9 {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>(Arrays.asList("Dog","Cat","Elephant","Lion"));
        HashSet<String> set2 = new HashSet<>(Arrays.asList("Cat","Giraffe","Dog","Monkey"));

        HashSet<String> union = new HashSet<>(set1);
        union.addAll(set2);

        HashSet<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        HashSet<String> difference = new HashSet<>(set1);
        difference.removeAll(set2);

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
        System.out.println("Difference: " + difference);
    }
}