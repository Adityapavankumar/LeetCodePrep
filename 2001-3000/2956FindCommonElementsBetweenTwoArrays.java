class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        // create hashmap
        Map<Integer, Integer> nums1Freq = new HashMap <>();
        for(int num: nums1){
            nums1Freq.put(num, nums1Freq.getOrDefault(num, 0)+1);
        }

        Map<Integer, Integer> nums2Freq = new HashMap <>();
        for(int num: nums2){
            nums2Freq.put(num, nums2Freq.getOrDefault(num, 0)+1);
        }

        // now sort both arrays
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        // pointers for both arrays
        int i = 0;
        int j = 0;

        // indiceCounters for both arrays
        int indexCounter1 = 0;
        int indexCounter2 = 0;
        while(i<nums1.length && j<nums2.length){
            if(i>0 && nums1[i] == nums1[i-1]){
                i++; // skip duplicates
                continue;
            }
            if(j>0 && nums2[j] == nums2[j-1]){
                j++;
                continue;
            }
            if(nums1[i] < nums2[j]){
                i++;
            } else if (nums1[i] > nums2[j]){
                j++;
            } else {
                indexCounter1 += nums1Freq.get(nums1[i]);
                indexCounter2 += nums2Freq.get(nums2[j]);
                i++;
                j++;
            }

        }
        int[] result = {indexCounter1, indexCounter2};
        return result;
    }
}