package stacks;

import java.util.Stack;

public class findCelebrity {
    static Stack<Integer> stack=new Stack<>();
    static int arr[][]={{0,0,1,0},
            {0,0,1,0},
            {0,0,0,0},
            {0,0,1,0}};
    public static void main(String[] args) {

        int c;
        int n=4;
        for(int i=0;i<n;i++)
        {
            stack.push(i);
        }
        int A= stack.peek();
        stack.pop();
        int B=stack.peek();
        stack.pop();
        while(stack.size()>1)
        {
            if(knows(A,B)) {
                A = stack.peek();
                stack.pop();
            }
            else {  B = stack.peek();
                stack.pop();}
        }
        int C=stack.peek();
        stack.pop();

        if(knows(C,B))
            C=B;
        if(knows(C,A))
            C=A;
        for(int i=0;i<n;i++)
        {
            if((i!=C) && (knows(C,i) || !knows(i,C))) System.out.println("-1");
        }
    }

    public static boolean knows(int x,int y)
    {
        if(arr[x][y] == 0) return false;
        else return true;
    }
}
