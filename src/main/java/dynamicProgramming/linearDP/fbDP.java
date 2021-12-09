package dynamicProgramming.linearDP;

import java.util.Arrays;

public class fbDP {
    static int n = 6;
    static int[] dp = new int[n+1];

    public static void main(String[] args) {
        Arrays.fill(dp,0);
        dp[1]=1;
        for (int i = 2; i <= n ; i++) {
             dp[i]=dp[i-1]+dp[i-2];
        }
        System.out.println(dp[n]);

    }

}
