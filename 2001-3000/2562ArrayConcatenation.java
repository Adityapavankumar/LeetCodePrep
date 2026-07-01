class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        long concatVal = (long) 0;
        while(start<end){
            String startString = (String) String.valueOf(nums[start]);
            String endString = (String) String.valueOf(nums[end]);
            concatVal += (long) Long.parseLong(startString + endString);
            start++;
            end--;
        }
        if(start==end){
            concatVal += nums[start];
        }
        return concatVal;
    }
}