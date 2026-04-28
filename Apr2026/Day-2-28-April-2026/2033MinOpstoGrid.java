class Solution {
    public int minOperations(int[][] grid, int x) {
        // get dimensions of grid
        int rows = grid.length;
        int cols = grid[0].length;

        // find remainder, it should be same for all items
        int remainder = grid[0][0]%x;

        // flatten 2D grid to one dimension array
        int[] flattenedArray = new int[rows*cols];

        // fill the flattened array
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                int curItem = grid[i][j];
                if(curItem%x != remainder){
                    return -1;
                }
                flattenedArray[(i*cols)+j] = grid[i][j];
            }
        }
        // sort flattened array
        Arrays.sort(flattenedArray);

        // find median value
        int medianValue = flattenedArray[flattenedArray.length >> 1];

        int totalOperations = 0;
        for(int value:flattenedArray){
            totalOperations += Math.abs(value-medianValue)/x;
        }

        return totalOperations;
    }
}