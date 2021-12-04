package stacks;

import java.util.Stack;

public class deleteMiddleElem {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        int mid=stack.size()/2;
        deleteMidElem(stack,mid);

    }

    static void deleteMidElem(Stack<Integer> stack,int mid)
    {
        Stack<Integer> tempStack=new Stack<>();
        int counter=1;
        while(counter<=mid)
        {
            tempStack.push(stack.peek());
            stack.pop();
            counter++;
        }
        stack.pop();

        while(!tempStack.isEmpty())
        {
            stack.push(tempStack.peek());
            tempStack.pop();
        }
    }
}
