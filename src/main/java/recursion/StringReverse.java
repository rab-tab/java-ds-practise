package recursion;

public class StringReverse {
    static String reverseStr=new String();
    public static void main(String[] args) {
        String s=new String("abc");
       // System.out.println(s.substring(1));
        System.out.println("Reverse is "+ reverse(s));
    }

    static String reverse(String input)
    {
        //base case
        System.out.println("base case");
        if(input.length()==0) return "";
        return reverse(input.substring(1))+input.charAt(0);
    }
}
