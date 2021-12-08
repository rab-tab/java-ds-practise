package recursion.subsets;

public class permuteWithSpaces {
    public static void main(String[] args) {
        //PENDING
        String s="abc";
        permute(s,s.length(),0,new StringBuilder(""));
    }

    public static void permute(String s,int len,int start,StringBuilder sb)
    {
        if(start==len)
        {
            System.out.println(sb);
            return;
        }

        char ch=s.charAt(start);
        sb.append(ch);
        permute(s,len,start+1,sb);
       // sb.deleteCharAt(sb.length()-1);

        //add space
        sb.append(ch).append(" ");
        permute(s,len+1,start+2,sb);
        //remove space
        sb.delete(start+1,1);

    }
}
