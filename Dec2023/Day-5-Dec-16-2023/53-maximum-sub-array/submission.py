class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # intialize two variables sol and summ
        # sol will be our final solution
        # summ is just a temporary placeholder
        sol = min(nums)
        summ = 0
        # Iterate through the list of number
        # at each level, update sol and summ as below
        for num in nums:
            summ = max(num, summ + num)
            sol = max(sol, summ)
        
        return sol
