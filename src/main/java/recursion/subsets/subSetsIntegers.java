package recursion.subsets;

import java.util.ArrayList;
import java.util.List;

public class subSetsIntegers {
    static List<Integer> tempAns=new ArrayList<>();
    static List<List<Integer>> ans=new ArrayList<>();
    public static void main(String[] args) {
        int arr[]={1,2,3};
        subsets(arr,arr.length,0);
        /*for(int i=0;i<ans.size();i++)
        {
            List<Integer> tmp=ans.get(i);
            System.out.println("List "+ i + "-------");
            for(Integer j:tmp)
            {
                System.out.println(j);
            }
        }*/
    }

    public static void subsets(int[] arr,int len,int i)
    {
        if(i==len)
        {
            if(tempAns.size()==0)
            {
                System.out.println("{}");
            }
            else{
                for(Integer k:tempAns)
                {
                    System.out.print(k + " , ");

                }
                System.out.println("------------------");
            }
            ans.add(tempAns);
            return;
        }
        subsets(arr,len,i+1);
        tempAns.add(arr[i]);
        subsets(arr,len,i+1);
        tempAns.remove(tempAns.size()-1);
    }
}
