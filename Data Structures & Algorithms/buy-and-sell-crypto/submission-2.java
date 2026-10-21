class Solution {
    public int maxProfit(int[] prices) {
        int minBuyingPrice = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            minBuyingPrice = Math.min(minBuyingPrice, prices[i - 1]);
            maxProfit = Math.max(maxProfit, prices[i] - minBuyingPrice);
        }
        return maxProfit;
    }
}
