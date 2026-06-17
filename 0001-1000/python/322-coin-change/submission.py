class Solution(object):
    def coinChange(self, coins, amount):
        """
        :type coins: List[int]
        :type amount: int
        :rtype: int
        """
         # Initialize an array to store the minimum number of coins needed for each amount
        dp = [float('inf')] * (amount + 1)
        dp[0] = 0  # Base case: 0 coins needed to make amount 0

        # Iterate over each coin denomination
        for coin in coins:
            # Update the dp array for each possible amount using the current coin
            for i in range(coin, amount + 1):
                dp[i] = min(dp[i], dp[i - coin] + 1)

        # If dp[amount] is still float('inf'), no combination of coins makes up the amount
        return dp[amount] if dp[amount] != float('inf') else -1
