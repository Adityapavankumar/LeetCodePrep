class Solution {
    public int findGCD(int[] nums) {
        // since given range of nums[i] is 1 to 1000
        int max = 0;
        int min = 1001;
        for(int num:nums){
            max = Math.max(num, max);
            min = Math.min(num, min);
        }
        // once max and min of array are found, find GCD for them
        return gcd(max, min);
    }

    public int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
}