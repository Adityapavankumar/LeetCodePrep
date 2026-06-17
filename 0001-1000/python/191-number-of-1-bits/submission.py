class Solution(object):
    def hammingWeight(self, n):
        """
        :type n: int
        :rtype: int
        """
        ans = 0
        for i in range(32):
            if (n >> i) & 1: # right shifting + and with 1 will tell us how many 1s are there in n
                ans += 1
        return ans
