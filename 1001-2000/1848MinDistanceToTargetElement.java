class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        // first we assume minimum distance is nums.length, because this is the maximum possible distance
        int minDistance = nums.length;
        int targetIndex = 0; // since we start at 0 index of array
        // now iterate through the array nums
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                int distance = Math.abs(i-start);
                if(distance<minDistance){
                    minDistance = distance;
                    targetIndex = i;
                }
            }
        }
        return minDistance;
    }
}