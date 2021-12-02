package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseQueue {
    static Queue<Integer> queue = new LinkedList<>();
    static Stack<Integer> stack=new Stack<>();

    public static void main(String[] args) {
        queue.add(3);
        queue.add(1);
        queue.add(8);
        queue.add(1);
        queue.add(4);
        queue.add(1);
        while(!queue.isEmpty())
        {
            stack.push(queue.peek());
            queue.remove();
        }

        while(!stack.isEmpty())
        {
            queue.add(stack.peek());
            stack.pop();
        }

    }
}
