import java.util.*;

class Q6 {
    public static void main(String[] args) {
        String str = "Hello World";
        String[] words = str.split(" ");

        Stack<String> stack = new Stack<>();

        for(String w : words)
            stack.push(w);

        while(!stack.isEmpty())
            System.out.print(stack.pop() + " ");
    }
}