class Solution {
    public int minElement(int[] nums) {
        // Create a new array with same length as nums
        int[] sumOfDigits = new int[nums.length];
        int min = 10001; // since nums[i] ranges between 1 and 10000

        // now iterate through nums array and find sum of digits for each element
        for(int i=0;i < nums.length;i++){
            int sum = 0;
            while(nums[i]!=0){
                sum += nums[i]%10;
                nums[i] = nums[i]/10;
            }
            if(sum<min){
                min = sum;
            }
        }
        return min;
    }
}