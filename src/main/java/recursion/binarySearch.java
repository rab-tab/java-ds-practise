package recursion;

public class binarySearch {
    public static void main(String[] args) {
        int arr[]={1,2,1,9,8};
        System.out.println(binarySearch(arr,0,arr.length-1,2));
    }

    public static int binarySearch(int[] arr,int left,int right,int elem)
    {
        if(left>right) return -1;
        int mid=(left+right)/2;
        if(elem==arr[mid]) return mid;
        if(elem<arr[mid]) {return binarySearch(arr,left,mid-1,elem);}
         return binarySearch(arr,mid+1,right,elem);

    }
}
