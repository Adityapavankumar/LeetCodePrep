class Solution(object):
    def countBits(self, n):
        """
        :type n: int
        :rtype: List[int]
        """
        ans = [0]*(n+1) # create list 

        for i in range(1,n+1):
            ans[i] = ans[i//2] + (i & 1)
        
        return ans
