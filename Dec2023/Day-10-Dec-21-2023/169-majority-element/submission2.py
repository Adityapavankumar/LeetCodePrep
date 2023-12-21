class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        count = 0
        majElement = 0
        for num in nums:
            if count == 0:
                majElement = num
            if majElement == num:
                count += 1
            else:
                count -= 1
        return majElement
