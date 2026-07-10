class Solution {
    public int numSpecial(int[][] mat) {
        int rowSize = mat.length;
        int colSize = mat[0].length;

        int[] rowSum = new int[rowSize];
        int[] colSum = new int[colSize];

        for(int row = 0; row < rowSize; row++){
            for(int col = 0; col < colSize; col++){
                rowSum[row] += mat[row][col];
                colSum[col] += mat[row][col];
            }
        }

        int specialNumCount = 0;

        for(int r=0; r < rowSize; r++){
            for(int c = 0; c < colSize; c++){
                if(mat[r][c] == 1 && rowSum[r] == 1 && colSum[c] == 1){
                    specialNumCount += 1;
                }
            }
        }

        return specialNumCount;
    }
}