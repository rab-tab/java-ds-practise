package recursion;

public class decimalToBinary {
    public static void main(String[] args) {
        int num=233;
        System.out.println(findBinary(num,""));

    }

    public static String findBinary(int decimal,String result)
    {
        if(decimal==0) return result;
        result=decimal%2+result;
        return findBinary(decimal/2,result);

    }
}
