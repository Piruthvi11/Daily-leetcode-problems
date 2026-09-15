class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length*mat[0].length!=r*c)
        {
            return mat;
        }
        int[][]result= new int[r][c]; // result=[[0,0,0,0]]
        int row=0; // new matrix row
        int col=0; // new matrix column
        for(int i=0;i<mat.length;i++)  // i,j old matrix row,col.
        {
            for(int j=0;j<mat[i].length;j++) // i=0,j=0 result=[[1,0,0,0]]
            {                                // i=0 j=1 result=[[1,2,0,0]] like wise..
                result[row][col]=mat[i][j];
                col++;
                if(col==c) // "Should I move to the next row?"
            {
                col=0;
                row++;
            }
            }
        }
        return result;
    }
}
