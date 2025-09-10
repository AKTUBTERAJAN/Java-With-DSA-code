public class Transpose {
    public static void main(String[] args) {
        int row=2,colum=3;
        int[][]matrix={{2,3,7},{5,6,7}};

        //Display orignal matrix
        printMatrix(matrix);

        //Transpose Matrix
        int transpose[][]=new int[colum][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<colum;j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        //Print Transpose Matrix
        printMatrix(matrix);
    }
    public static void printMatrix(int matrix[][]) {
        System.out.println("The Matrix is :");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.println(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
