class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        output = [1] * len(nums)
        leftProduct = 1
        rightProduct = 1
        i = 0
        j = len(nums) - 1
        while i < len(nums):
            output[i] *= leftProduct
            output[j] *= rightProduct
            leftProduct *= nums[i]
            rightProduct *= nums[j]
            i = i+1
            j = j-1
        return output   
