package dynamicProgramming.recursion;

public class uniquePathRightDownWithObstacles {
    static int rows = 2;
    static int cols = 3;
    public static void main(String[] args) {
        int arr[][] = {{1, 1},
                {0, 1},
                {0, 1},   };
                gridTraveller(rows,cols,arr);

    }

    static int gridTraveller(int rows,int cols,int[][] arr)
    {
        if(arr[rows][cols]==0) return 0;
        if(rows==1 && cols==1) return 1;
        if(rows==0 || cols==0) return 0;
        return gridTraveller(rows-1,cols,arr)+gridTraveller(rows,cols-1,arr);
    }
}
