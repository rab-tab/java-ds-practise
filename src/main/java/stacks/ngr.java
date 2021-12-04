package stacks;

import java.util.Stack;

public class ngr {
    static Stack<Integer> stack=new Stack<>();
    public static void main(String[] args) {
        int arr[]={100,80,101,50};
        int ngr[]=new int[arr.length];
        int temp[]=nearestLargestElem(arr,ngr);
        for(Integer i:temp)
        {
            System.out.println(i);
        }

    }

    public static int[] nearestLargestElem(int arr[],int[] ngr)
    {
        for(int i=arr.length-1;i>=0;i--)
        {
            if(stack.isEmpty())
            {
                ngr[i]=-1;
            }
            if(stack.size()>0 && stack.peek()>arr[i])
            {
                ngr[i]=stack.peek();
            }
            if(stack.size()>0 && stack.peek()<arr[i])
            {
                while(stack.size()>0 && stack.peek()<arr[i])
                {
                    stack.pop();
                }
                if(stack.size()==0) ngr[i]=-1;
                else ngr[i]=stack.peek();
            }
            stack.push(arr[i]);
        }
        return ngr;

    }
}
