// For rotation, first transpose matrix and then reverse vertically
class Solution {
    public void rotate(int[][] matrix) {
        // find matrix length
        int matrixLength = matrix.length;
        // transpose matrix, rows become cols and cols become rows
        for(int i=0;i<matrixLength;i++){
            // we kept j<i so to iterate on lower triangle to avoid double swapping
            for(int j=0;j<i;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // Now horizontal mirror flip
        // [i][j] becomes [matrixLength - i - 1][j] (j constant since just horizontal flip)
        for(int i=0;i<(matrixLength/2);i++){
            for(int j=0;j<matrixLength;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[matrixLength-i-1][j];
                matrix[matrixLength-i-1][j] = temp;
            }
        }
    }
}