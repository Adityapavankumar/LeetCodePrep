class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;

        for(int num:nums){
            result ^= num; // XOR of number with number is 0, only single number remains
        }

        return result;
    }
}