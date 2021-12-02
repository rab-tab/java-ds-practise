package Hashing;

public class pairsWithGivenSumBruteForce {
    public static void main(String[] args) {
        int arr[]={1,5,7,-1};
        int sum=6;
        int n=arr.length;
        System.out.println(getPairsCount(arr,sum,n));
    }


    public static int getPairsCount(int arr[],int sum,int n)
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==sum) count++;
            }
        }
        return count;
    }
}
