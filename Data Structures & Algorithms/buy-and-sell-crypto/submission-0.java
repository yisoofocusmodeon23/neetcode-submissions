class Solution {
    public int maxProfit(int[] prices) {
        int minBuyPrice = prices[0], maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            minBuyPrice = Math.min(minBuyPrice, prices[i - 1]);
            maxProfit = Math.max(maxProfit, prices[i] - minBuyPrice);
        }
        return maxProfit;
    }
}
