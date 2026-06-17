This question is to find the largest area between bars. To do this we start at left = 0 and right = n-1, where n is length of array.

We calculate area = minHeight * (r-l)
As height[l] < height[r]
we update l += 1
else we update r -= 1
and repeat the process with help of while loop above.

after loop ends we return final answer. Code is below:
```python
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
```

This is the first submission of the day
