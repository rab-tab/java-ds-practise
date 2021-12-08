package backtracking;

import java.util.ArrayList;
import java.util.List;

public class combinationSumWithDuplicates {
    static List<Integer> tempAns=new ArrayList<>();
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int target=4;
        int sum=0;
        combinationSum(arr,arr.length,sum,0,target);
    }

    public static void combinationSum(int[] arr,int len,int sum,int start,int target) {
        //base case
        if (sum == target) {
            for (Integer i : tempAns) {
                System.out.print(i + " , ");
            }
            System.out.println("---------------------------");
            return;
        }
        if (start == len || sum > target) {
            return;
        }
        sum = sum + arr[start];
        tempAns.add(arr[start]);
        //left side - dont include the elem
        combinationSum(arr, len, sum, start, target);
        //right side tree
        sum = sum - arr[start];
        tempAns.remove(tempAns.size() - 1);
        combinationSum(arr, len, sum, start + 1, target);
    }
}
