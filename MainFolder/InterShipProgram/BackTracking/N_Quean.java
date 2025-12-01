public class N_Quean {
    public static boolean  issafe(char boar[][],int row,int col){
        //vertical up
        for(int i=row-1;i>=0;i--){
            if(boar[i][col]=='Q'){
                return false;
            }
        }
        //digonal left up

        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(boar[i][j]=='Q'){
                return false;
            }
        }
        //digonal right up
         for(int i=row-1,j=col+1;i>=0 && j<boar.length;i--,j++){
            if(boar[i][j]=='Q'){
                return false;
            }
        }
        
        return true;
    }
    public static void nQueens(char boar[][],int row){
       //base case
       if(row==boar.length){
            printBoard(boar);
            return;
       }
       //coloum loop
        for(int j=0;j<boar.length;j++){
            if(issafe(boar,row,j)){
                boar[row][j]='Q';
                nQueens(boar, row+1);//function call
                boar[row][j]='x';//backtracking
            }
        }
    }
    public static void printBoard(char boar[][]) {
        System.out.println("----------- chess board -------------");
        for(int i=0;i<boar.length;i++){
            for(int j=0;j<boar.length;j++){
                System.out.print(boar[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        int n=4;
        char boar[][]=new char[n][n];

        //initilize
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                boar[i][j]='x';
            }
        }
        nQueens(boar,0);
    }
    
}
