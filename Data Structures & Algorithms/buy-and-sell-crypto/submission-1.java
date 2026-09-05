class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minBuyingPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            minBuyingPrice = Math.min(prices[i - 1], minBuyingPrice);
            maxProfit = Math.max(prices[i] - minBuyingPrice, maxProfit);
        }
        return maxProfit;
    }
}
