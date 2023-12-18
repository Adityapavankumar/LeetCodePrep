class Solution:
    def maxProductDifference(self, nums: List[int]) -> int:
        max1 = min(nums)
        max2 = min(nums)
        min1 = max(nums)
        min2 = max(nums)

        for num in nums:
            if num > max1:
                max2 = max1
                max1 = num
            elif num > max2:
                max2 = num
            if num < min1:
                min2 = min1
                min1 = num
            elif num < min2:
                min2 = num
        
        return (max1*max2)-(min1*min2)
