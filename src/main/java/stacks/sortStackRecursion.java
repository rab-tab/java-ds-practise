package stacks;

import java.util.Stack;

public class sortStackRecursion {
   static  Stack<Integer> minStack=new Stack<>();
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(-3);
        stack.push(14);
        stack.push(18);
        stack.push(-5);
        stack.push(30);
        if(!stack.isEmpty()) minStack.push(stack.peek());
    }

    static void sort(Stack<Integer> stack)
    {
        //find min in stack for every recursive call
        // insert that min elem into minStack
        //pop from main stack

        /*int min=findMin(stack);
        minStack.push(min);
        stack.pop();
        sort(stack);*/

    }
}
