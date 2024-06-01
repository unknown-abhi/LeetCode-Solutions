class Solution {
    public int maxProfit(int[] prices) {

        int mini = prices[0];
        int maxProfit = 0;
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            profit = prices[i] - mini;
            maxProfit = Math.max(maxProfit, profit);
            mini = Math.min(mini, prices[i]);
        }
        return maxProfit;
    }
}