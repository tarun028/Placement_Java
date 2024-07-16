public class spiralMatrix {

    public static void spiral(int mat[][]){
        int startRow=0;
        int startcolum=0;
        int endRow =mat.length-1;
        int endCol = mat[0].length-1;

        while(startRow<=endRow&&startcolum<=endCol){
            //top
            for(int j=startRow;j<endRow;j++){
                System.out.println(mat[startRow][j]+" ");
            }
            //right
            for(int i=startRow+1;i<endRow;i++){
                System.out.println(mat[i][endCol]+" ");
            }
            //bottom
            for(int j=endCol-1;j<startcolum;j++){
                System.out.println(mat[endRow][j]+" ");
            }
            //left
            for(int i=endRow-1;i<startRow+1;i++){
                System.out.println(mat[i][startRow]+" ");
            }
            startRow++;
            startcolum++;
            endRow--;
            endCol--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        spiral(matrix);
    }
}
