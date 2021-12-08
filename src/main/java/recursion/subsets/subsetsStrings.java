package recursion.subsets;

import java.util.ArrayList;
import java.util.List;

public class subsetsStrings {
    static List<String> tempAns=new ArrayList<>();
    static List<List<String>> ans=new ArrayList<>();
    public static void main(String[] args) {
        String s="abc";
        String curr="";
        subsets(s,s.length(),0,curr);
    }

    public static void subsets(String s, int len,int i,String curr)
    {
        if(i==len)
        {
            System.out.println(curr);
            return;
        }
        subsets(s,len,i+1,curr);
        //tempAns.add(s.substring(i));
        subsets(s,len,i+1,curr+s.charAt(i));
      //  tempAns.remove(tempAns.size()-1);
    }
}
