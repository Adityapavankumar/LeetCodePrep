class Solution {
    public int searchInsert(int[] nums, int target) {
        // it is a sorted array, so we have to check until it is equal or greater than
        int i=0;
        while(nums[i]<=target){
            if(nums[i]==target){
                return i;
            } else if (i==nums.length-1){
                return i+1;
            }
            if(i<nums.length-1){
                i++;
            }
        }
        return i; // even if no target value found, last index before it exceeds target should be entry point
    }
}