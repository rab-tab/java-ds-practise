package dynamicProgramming.recursion;

public class travellerGrid {
    //assuming we are starting at index [2][3]
    static int rows = 2;
    static int cols = 3;
    public static void main(String[] args) {
        System.out.println("Total paths -- "+gridTraveller(rows,cols));
    }

    static int gridTraveller(int rows,int cols)
    {
        if(rows==1 && cols==1) return 1;
        if(rows==0 || cols==0) return 0;
        return gridTraveller(rows-1,cols)+gridTraveller(rows,cols-1);
    }

}
