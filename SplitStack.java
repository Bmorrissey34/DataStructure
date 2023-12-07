import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SplitStack {

    // Method to split the stack into negatives and non-negatives
    public static void splitStack(Stack<Integer> stack) {
        Queue<Integer> queue = new LinkedList<>();

        // First, transfer all elements from the stack to the queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        // Transfer non-negative numbers back to the stack
        for (int num : queue) {
            if (num >= 0) {
                stack.push(num);
            }
        }

        // Transfer negative numbers to the stack so they end up at the bottom
        for (int num : queue) {
            if (num < 0) {
                stack.push(num);
            }
        }
    }

    // Main method to test the splitStack function
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(5); stack1.push(-5); stack1.push(67); stack1.push(-45); stack1.push(67);
        stack1.push(9); stack1.push(0); stack1.push(-42); stack1.push(56); stack1.push(-7);
        splitStack(stack1);
        System.out.println("First Example: " + stack1);

        Stack<Integer> stack2 = new Stack<>();
        stack2.push(1); stack2.push(-2); stack2.push(-3); stack2.push(4); stack2.push(-5);
        stack2.push(6); stack2.push(-7); stack2.push(8); stack2.push(-9);
        splitStack(stack2);
        System.out.println("Second Example: " + stack2);
    }
}
