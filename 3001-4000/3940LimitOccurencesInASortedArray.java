class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        // create a new array list to store final output
        ArrayList<Integer> resultList = new ArrayList<>();

        // track copies using a counter
        int copyCounter = 1;

        // add first element to result list initially
        resultList.add(nums[0]);

        // now iterate through remaining list
        for(int i=1; i < nums.length; i++){
            // first update copy counter
            if(nums[i]==nums[i-1]){
                copyCounter += 1;
            } else {
                // reset copyCounter back to 1
                copyCounter = 1;
            }
            // add only first k copies of any distinct element
            if(copyCounter <= k){
                resultList.add(nums[i]);
            }
        }
        // now convert array list to an array
        int[] resultArray = new int[resultList.size()];

        for(int i=0; i<resultList.size(); i++){
            resultArray[i] = resultList.get(i);
        }

        return resultArray;
    }
}