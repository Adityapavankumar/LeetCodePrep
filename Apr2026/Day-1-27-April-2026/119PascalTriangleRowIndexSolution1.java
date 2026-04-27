// Here we are generating pascal triangle and then returning row
// It can be more efficient by generating that row itself
// this solution beats 68.16% people
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> pascalTriangle = new ArrayList <>();

        // First row is always 1
        pascalTriangle.add(List.of(1));

        int rowCounter = 0; // this rowCounter will be useful later

        // Generate remaining rows based on numRows
        while(rowIndex>rowCounter) {
            List<Integer> curRow = new ArrayList <>();
            curRow.add(1); // 1 is first in each row
            List<Integer> prevRow = pascalTriangle.get(rowCounter);
            int colCounter = 1; // generate items from index 1 to prev.size (currentrowsize-1)
            while(colCounter<(prevRow.size())){
                // generate middle items here
                curRow.add(prevRow.get(colCounter)+prevRow.get(colCounter-1));
                colCounter += 1; // increment counter
            }
            curRow.add(1); // row ends with 1
            pascalTriangle.add(curRow); // add current row to the pascalTriangle
            rowCounter += 1; // increment counter
        }
        return pascalTriangle.get(rowIndex);

    }
}