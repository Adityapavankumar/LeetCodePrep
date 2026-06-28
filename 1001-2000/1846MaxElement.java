class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        // first sort array
        Arrays.sort(arr);

        arr[0] = 1; // first element should be zero

        int maxElement = 1;

        for(int i=1; i<arr.length; i++){
            int extraDiff = Math.max(0, arr[i] - arr[i-1] - 1);

            arr[i] -= extraDiff;

            maxElement = Math.max(maxElement, arr[i]);
        }
        return maxElement;

    }
}