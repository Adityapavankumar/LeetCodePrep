class Solution(object):
    def buyChoco(self, prices, money):
        """
        :type prices: List[int]
        :type money: int
        :rtype: int
        """
        min1 = max(prices) 
        min2 = max(prices)
        for price in prices:
            if price < min1:
                min2 = min1
                min1 = price
            elif price < min2:
                min2 = price

        if (money-(min1+min2)) >= 0:
            return money-(min1+min2)
        else:
            return money
