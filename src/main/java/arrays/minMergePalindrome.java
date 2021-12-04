package arrays;

public class minMergePalindrome {
    public static void main(String[] args) {
        int arr[]={11,14,15,99};
        System.out.println("MIn merges "+minMerges(arr,arr.length));

    }

    public static int minMerges(int arr[],int n)
    {
        int count=0;
        for(int i=0,j=n-1;i<=j;)
        {
            if(arr[i]==arr[j]) {i++;j--;}
            else if(arr[i]>arr[j])
            {
                j--;
                arr[j]=arr[j]+arr[j+1];
                count++;
            }
            else
            {
                i++;
                arr[i]=arr[i]+arr[i-1];
                count++;
            }
        }
        return count;
    }
}
