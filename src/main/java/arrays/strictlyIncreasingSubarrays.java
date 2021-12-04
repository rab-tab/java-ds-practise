package arrays;

public class strictlyIncreasingSubarrays {
    public static void main(String[] args) {
        int arr[]={1,2,2,4};
        System.out.println("Strictly increasing subarray count "+countIncreasingSubarray(arr,arr.length));
    }

    public static int countIncreasingSubarray(int arr[],int n)
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
           // System.out.println("For loop 1");
            for(int j=i+1;j<n;j++)
            {
             //   System.out.println("For loop 2");
                if(arr[j]>arr[j-1]){
                   // System.out.println(arr[j] + " is greater than "+ arr[j-1]);
                    count++;
                }
                else break;
            }
        }
        return count;
    }
}
