object Solution {
    def maxProfit(prices: Array[Int]): Int = {
        var maxProfit = 0
        var minPrice = prices(0)
        for(i <- 0 to (prices.length-1)){
            minPrice = Math.min(minPrice, prices(i))
            maxProfit = Math.max(maxProfit, prices(i)-minPrice)
        }
        return(maxProfit)
    }
}
