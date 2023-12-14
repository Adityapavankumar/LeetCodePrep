class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        # less time complex solution
        hashMap = {}
        for i in range(len(nums)):
            difference=target-nums[i]
            if difference in hashMap:
                return [i, hashMap[difference]]
            hashMap[nums[i]]=i # this hashmap maps value to the index
