class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        profit = 0
        for i in range(len(prices)):
            for j in range(i+1, len(prices)):
                if((prices[j]-prices[i])>profit):
                    profit = prices[j] - prices[i]
        return profit
