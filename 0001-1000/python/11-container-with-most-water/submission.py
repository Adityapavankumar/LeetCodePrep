class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        l = 0
        r = len(height) - 1
        ans = 0
        while l < r:
            minHeight = min(height[l], height[r])
            ans = max(ans, minHeight*(r-l))
            if height[l] < height[r]:
                l += 1
            else:
                r -= 1
        return ans
