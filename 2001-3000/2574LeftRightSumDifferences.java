class Solution {
    public int[] leftRightDifference(int[] nums) {
        // initialize leftRightDiff array
        // it will be same size as nums
        int[] leftRightDiff = new int[nums.length];

        // looping through nums array
        for(int i=0;i<nums.length;i++){
            // create temporary variable left
            int left = i-1; // start from one index left
            int leftSum = 0;
            while(left>=0){
                leftSum += nums[left];
                left -= 1;
            }
            int right = i+1; // same with right
            int rightSum = 0;
            while(right<nums.length){
                rightSum += nums[right];
                right += 1;
            }
            leftRightDiff[i] = Math.abs(leftSum-rightSum);
        }
        return leftRightDiff;
    }
}