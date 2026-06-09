class Solution {
    public long maxTotalValue(int[] nums, int k) {
        // initialize min and max
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int num:nums){
            if(num<min){
                min = num;
            }
            if(num>max){
                max = num;
            }
        }
        // because for maximum difference between min and max for each subarray
        // they should contain both the min & max values of total array and
        // k such subarrays exist, hence max diff will be (max-min)*k
        long maxDiff = (long)(max-min)*k;  // have to type cast as it overflows integer limit
        return maxDiff;
    }
}