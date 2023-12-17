class Solution(object):
    def search(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        first = 0
        last = len(nums) - 1
        while first <= last:
            middle = (first + last) // 2
            if nums[middle] == target:
                return middle
            if nums[first] <= nums[middle]:  # check if first to middle is sorted array
                if nums[first] <= target < nums[middle]:  # check if target is in between
                    last = middle - 1  # update last if in between
                else:
                    first = middle + 1  # update first if later
            else:
                if nums[middle] < target <= nums[last]:
                    first = middle + 1
                else:
                    last = middle - 1
        return -1
