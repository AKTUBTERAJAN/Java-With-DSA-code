public class Sudoku{
    public static boolean sudokusolver(int sudoku[][],int row,int col){
        //base case
        if(row==9 && col==9){
            return  true;
        }else if(row==9){
            return false;
        }
        //recursion
        int nextRow=row,nextcol=col+1;
        if(col+1==9){
            nextRow=row+1;
            nextcol=0;
        }
        if(sudoku[row][col]!=0){
            return sudokusolver(sudoku, nextRow, nextcol);
        }
        for(int digit=1;digit<=9;digit++){
            if(issafe(sudoku,row,col,digit)){
                sudoku[row][col]=digit;
                if(sudokusolver(sudoku, nextRow, nextcol)){
                    return true;
                }
                sudoku[row][col]=0;
            }
        }
        return  false;

    }
    public static void main(String args[]){
        int sudoku[][]={{0,0,8,0,0,0,0,0,0},
                        {4,9,0,1,5,7,0,0,2},
                    {0,0,3,0,0,4,1,9,0},
                {1,8,5,0,6,0,0,2,0},
                {1,8,4,5,6,0,3,2,0},
                {2,8,5,3,6,0,0,9,0},
                {3,8,5,0,6,0,4,2,0},
                {1,8,5,9,6,0,0,3,0},
                {1,8,5,0,6,0,0,7,0},
            };
    }
}