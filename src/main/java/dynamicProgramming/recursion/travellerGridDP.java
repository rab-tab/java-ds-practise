package dynamicProgramming.recursion;

import java.util.Arrays;

public class travellerGridDP {
    //not working
    static int rows = 2;
    static int cols = 3;
    static int dp[][]=new int[rows][cols];
    public static void main(String[] args) {

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                dp[i][j]=0;
            }
        }
        dp[1][1]=1;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(i + 1<rows && j+1<cols) {
                    dp[i][j] = dp[i + 1][j] + dp[i][j + 1];
                }
            }
        }
        System.out.println("Total paths -- "+dp[rows-1][cols-1]);
    }


}
