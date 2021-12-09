package dynamicProgramming.recursion;

public class travellerGrid1 {
    //assuming we are starting at index [0][0]
    static int totalRows = 2;
    static int totalCols = 3;
    public static void main(String[] args) {
        System.out.println("Total paths -- "+gridTraveller(totalRows,totalCols,0 ,0));
    }

    static int gridTraveller(int totalRows,int totalCols,int row,int col)
    {
        if(row>totalRows-1 || col>totalCols-1) return 0;
        if(totalRows==1 && totalCols==1) return 1;
        if(totalRows==0 || totalCols==0) return 0;
        if(row==totalRows-1 && col==totalCols-1)
            return 1;

        return gridTraveller(totalRows,totalCols,row+1,col)+gridTraveller(totalRows,totalCols,row,col+1);
    }
}
