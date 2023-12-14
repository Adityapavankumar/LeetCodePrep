class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        buyPrice = prices[0]
        maxProfit = 0
        for i in range(len(prices)):
            # check for minimum buying price
            if prices[i] < buyPrice:
                # update buying price
                buyPrice = prices[i]
            # check for max profit value
            if (prices[i]-buyPrice)>maxProfit:
                maxProfit = prices[i] - buyPrice
        return maxProfit
