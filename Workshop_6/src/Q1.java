import java.util.*;

class Q1{
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Manish");
        students.add("Ravi");
        students.add("Himanshu");
        students.add("Ayush");
        students.add("Abhijeet");

        students.remove("Manish");

        System.out.println(students);
    }
}