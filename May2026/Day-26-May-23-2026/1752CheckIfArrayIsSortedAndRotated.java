class Solution {
    public boolean check(int[] nums) {
        // valid rotated sorted array will have at max 1 breakpoint
        int breakPoints = 0;
        int arrayLength = nums.length;
        for(int i=0;i < (arrayLength); i++){
            int next = (i+1)%arrayLength;
            if(nums[i]>nums[next]){
                breakPoints++ ;
            }
        }
        if(breakPoints <= 1){
            return true;
        } else {
            return false;
        }
    }
}