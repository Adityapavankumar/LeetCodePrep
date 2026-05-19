class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        // since arrays are already in ascending order, first match should be minimum common integer
        for(int i=0; i<nums1.length;i++){
            int index = Arrays.binarySearch(nums2, nums1[i]);
            if(index >= 0){
                return nums1[i];
            }
        }
        return -1;
    }
}