class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int maxDistance = 0;
        for(int i=0; i<nums1.length; i++){
            int high = nums2.length - 1;
            int low = i;
            int farthest = -1;

            while(low<=high){
                int mid = low + (high-low)/2;

                if(nums2[mid]>=nums1[i]){
                    farthest = mid;
                    low = mid+1; // move right to find if there is any further index
                } else {
                    // move left to identify index
                    high = mid - 1;
                }
            }

            // after furthest match for i is identified
            if(farthest != -1){
                maxDistance = Math.max(maxDistance, farthest-i);
            }
        }
        return maxDistance;
    }
}