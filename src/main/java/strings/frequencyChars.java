package strings;

public class frequencyChars {
    public static void main(String[] args) {

        String s="aabc";
        int freqArr[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            freqArr[s.charAt(i)-'a']++;
        }
        System.out.println("Frequency array is ----");
        for(Integer i:freqArr)
        {
            System.out.println(i);
        }
    }
}
