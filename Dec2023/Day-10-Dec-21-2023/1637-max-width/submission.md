This question is to find maxwidth between consecutive points in x-axis.
code:
```python
class Solution(object):
    def maxWidthOfVerticalArea(self, points):
        """
        :type points: List[List[int]]
        :rtype: int
        """
        xAxisPoints = []
        for point in points:
            xAxisPoints.append(point[0])
        xAxisPoints.sort()
        maxWidth = 0
        for i in range(len(xAxisPoints)-1):
            if i > 0:
                maxWidth = max(maxWidth, xAxisPoints[i]-xAxisPoints[i-1])

        return maxWidth
```
This is daily challenge of today
![submission](submission.png)