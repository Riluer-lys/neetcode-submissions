class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if prices == sorted(prices, reverse=True):
            return 0
        
        res = 0
        for i in range(len(prices)):
            for j in range(i + 1, len(prices)):
                res = max(res, prices[j] - prices[i])

        return res