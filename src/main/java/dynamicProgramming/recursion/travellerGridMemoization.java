package dynamicProgramming.recursion;

public class travellerGridMemoization {
    static int totalRows = 2;
    static int totalCols = 3;
    static int dp[][]=new int[totalRows+1][totalCols+1];
    public static void main(String[] args) {
        for(int i=0;i<=totalRows;i++)
        {
            for(int j=0;j<=totalCols;j++)
            {
                dp[i][j]=0;
            }
        }
        System.out.println("Total paths -- "+gridTraveller(0,0,dp));
    }

    static int gridTraveller(int currRow,int currCol,int[][] dp)
    {
        if(dp[currRow][currCol]!=0) return dp[currRow][currCol];
        if(totalRows==1 && totalCols==1) return 1;
        if(totalRows==0 || totalCols==0) return 0;
        return gridTraveller(currRow+1,currCol,dp)+gridTraveller(currRow,currCol+1,dp);
    }

}
