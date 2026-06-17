class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        i = 0
        # iterate though the array
        for num in nums:
            if i<1 or num > nums[i-1]:
                nums[i] = num
                i += 1
        
        return i
