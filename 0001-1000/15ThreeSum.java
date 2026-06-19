class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // solve using 2 pointer method
        // iterate through list from start and try to identify other two
        // first sort array
        Arrays.sort(nums);

        // loop through from start to len - 2
        int len = nums.length;
        List<List<Integer>> result = new ArrayList<>();

        for(int i=0;i<len-2;i++){
            // skipping duplicates for i
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }

            // for left and right
            int left = i+1;
            int right = len-1;

            while(left<right){
                // calculate sum
                int sum = nums[i]+nums[left]+nums[right];

                // if more than 0, move right
                if(sum>0){
                    right--;
                } else if (sum<0){
                    left++;
                } else {
                    result.add(List.of(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    while(left<right && nums[left]==nums[left-1]){
                        left++;
                    }

                    while(left<right && nums[right]==nums[right+1]){
                        right--;
                    }
                }

            }
        }

        return result;
    }
}