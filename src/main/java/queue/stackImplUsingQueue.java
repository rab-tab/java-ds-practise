package queue;

import java.util.LinkedList;
import java.util.Queue;

public class stackImplUsingQueue {
    static Queue<Integer> queue = new LinkedList<>();
    public static void main(String[] args) {

        int size = 5;
        int elem = 6;
        for (int i = 1; i <= size; i++) {
            queue.add(i);
        }
        System.out.println("Queue elemns --------");
        for(Integer i:queue)
        {
            System.out.println(i);
        }
        enqueue(elem,size);
    }

    public static void enqueue(int elem,int size)
    {
        queue.add(elem); // 1 2 3 4 5 6
        for(int i=1;i<=size;i++)
        {
            System.out.println(queue.peek());
            int temp=queue.peek();
            queue.remove(temp);
            queue.add(temp);
        }
        System.out.println("Queue elems after enqueu");
        for(Integer i:queue)
        {
            System.out.println(i);
        }

    }
}
