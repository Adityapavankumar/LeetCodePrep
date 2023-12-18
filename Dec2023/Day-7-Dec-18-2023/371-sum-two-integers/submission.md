Code used is below:
```python
class Solution:
  def getSum(self, a: int, b: int) -> int:
    mask = 0xFFFFFFFF
    kMax = 2000

    while b != 0:
      a, b = (a ^ b) & mask, ((a & b) << 1) & mask

    return a if a < kMax else ~(a ^ mask)
```

Initial solution was just updating a, b.
a = a^b
b = (a & b) << 1
The loop will exit when a & b = 0

This is very time complex for cases where a = -1, b = 1
For this we added the mask additionally. The mask is also AND with the previous operations.

In the end we check for any overflow where a might become greater than kMax

Second submission of the day
![submission](submission.png)