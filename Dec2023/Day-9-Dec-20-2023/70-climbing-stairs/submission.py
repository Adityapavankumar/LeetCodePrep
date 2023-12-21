class Solution(object):
    def climbStairs(self, n):
        """
        :type n: int
        :rtype: int
        """
        if n==0:
            return 0
        if n ==1:
            return 1
        if n ==2:
            return 2
        # initialize an array to hold answer
        ans = [0] * (n+1)
        ans[1] = 1
        ans[2] = 2
        for i in range(3, n+1):
            ans[i] = ans[i-1] + ans[i-2] # at every step, number of possible solutions is sum of previous two possibilities
        return ans[n]
