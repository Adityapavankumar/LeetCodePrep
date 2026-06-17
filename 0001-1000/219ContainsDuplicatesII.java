class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // create a hash map to store number and index values
        Map<Integer, Integer> numToIndexMap = new HashMap<>();

        // now iterate through array
        for(int i=0; i<nums.length; i++){
            // check if current number already has any previous index
            // if not, return default value of -10000000 to throw off k calculation
            int prevIndex = numToIndexMap.getOrDefault(nums[i],-1000000);

            if(i-prevIndex <= k){
                return true;
            }

            // update map
            numToIndexMap.put(nums[i], i);
        }
        return false; // no duplicates within k found
    }
}