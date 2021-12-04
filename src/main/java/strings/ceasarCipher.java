package strings;

public class ceasarCipher {
    public static void main(String[] args) {
        String s="abc";
        int shift=23;
        System.out.println((int)'a');
        String output="";
        int temp;
        for(int i=0;i<s.length();i++)
        {
            temp=(int)s.charAt(i)+shift;
            output=output+(char)temp;
        }
        System.out.println("Outuput is "+output);
    }

}
