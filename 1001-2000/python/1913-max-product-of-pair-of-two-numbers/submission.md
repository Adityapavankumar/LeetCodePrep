Code used is below:
```python
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
```

We start with 4 values max1, max2 and min1, min2.
We initialize them as shown above.
As we iterate through numbers, we update max1 and max2 and simultaneously min1 and min2
Key magic lies when we update max1, we also update max2 with previous value of max1. Similarly for min1 and min2.

This is leet code's daily challenge submission:
![submission](submission.png)

