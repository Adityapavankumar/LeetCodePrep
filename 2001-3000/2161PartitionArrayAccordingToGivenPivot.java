class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        // create a new result array
        int[] result = new int[nums.length];

        // pointer for input
        int index = 0;

        // iterate through nums and fill less than pivot
        for(int num: nums){
            if(num<pivot){
                result[index++]=num;
            }
        }

        // now fill equal to pivot
        for(int num:nums){
            if(num==pivot){
                result[index++]=num;
            }
        }

        // now fill greater than pivot
        for(int num:nums){
            if(num>pivot){
                result[index++]=num;
            }
        }

        return result;
    }
}