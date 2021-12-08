package recursion.subsets;

public class permuteWithCaseChange {
    public static void main(String[] args) {
        String s="ab";
        String curr="";
        permuteCaseChange(s,s.length(),0,curr);
    }

    public static void permuteCaseChange(String s,int len,int start,String curr)
    {
        //left recursive call
        //right recursive call
        //base case
        if(start==len)
        {
            System.out.println(curr);
            return;
        }
        //left recursive call
        permuteCaseChange(s,len,start+1,curr+s.charAt(start));
        //right recursive call
        char ch=Character.toUpperCase(s.charAt(start));
        curr=curr+ch;
        permuteCaseChange(s,len,start+1,curr);
        //undo the changes
        ch=Character.toLowerCase(s.charAt(start));
        //curr=ch+s.substring(start+1,len);
        curr=curr+ch;

    }
}
