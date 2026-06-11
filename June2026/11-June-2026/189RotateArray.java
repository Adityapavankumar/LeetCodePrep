class Solution {
    public void rotate(int[] nums, int k) {
        // have to solve this without creating any new arrays
        int n = nums.length; // size of array nums

        k = k%n; // to handle cases where k>n

        // to solve effectively, first reverse entire array
        rotateArray(nums, 0, n-1);

        // then reverse first k elements
        rotateArray(nums, 0, k-1);

        // then remaining elements
        rotateArray(nums, k, n-1);
    }

    // method to rotate array a between two indices i and j
    public int[] rotateArray(int[] a, int i, int j){
        int temp = 0;
        while(i<j){
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        return a;
    }
}