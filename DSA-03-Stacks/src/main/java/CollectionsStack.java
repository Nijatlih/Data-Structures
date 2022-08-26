import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class CollectionsStack {
    public static void main(String[] args) {

//        Stack<Integer> objects = new Stack<>();
//        Deque<Integer> stackObj = new ArrayDeque<>();

        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < 5;i++) {
            stack.push(i);
        }
        System.out.println("Stack elements are:");
        stack.forEach(System.out::println);
        System.out.println("Top of the stack is:   "+ stack.peek());
        stack.pop();
        stack.pop();
        System.out.println("Updated Stack:   ");
        stack.forEach(System.out::println);
    }
}
