package arrays;

public class minDiffBetweenElems {
    public static void main(String[] args) {
        int arr[]={1,5,3,19,18,25};
        System.out.println("Min diff is "+findMinDiff(arr,arr.length));
    }
    public static int findMinDiff(int arr[],int n)
    {
        int diff=Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(Math.abs(arr[j]-arr[i])<diff)
                    diff=Math.abs(arr[j]-arr[i]);
            }
        }
        return diff;

    }
}
