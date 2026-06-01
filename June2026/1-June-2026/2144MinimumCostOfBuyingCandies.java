class Solution {
    public int minimumCost(int[] cost) {
        // first sort array in ascending order
        Arrays.sort(cost);

        // initialize total cost first
        int totalCost = 0;

        // now loop from behind for every 3 elements
        for(int i = cost.length - 1; i >= 0; i -= 3){
            // first add highest number in 3 set
            totalCost += cost[i];

            // if second element exists, add its cost too
            if(i > 0){
                totalCost += cost[i-1];
            }

            // no need to add last element
        }
        return totalCost;
    }
}