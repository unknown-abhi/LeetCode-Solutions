class Solution {
    public int maxProfit(int[] prices) {

        int size = prices.length;
        int mini = prices[0];
        int maxProfit = 0;
        int profit = 0;

        for (int i = 0; i < size; i++) {
            profit = prices[i] - mini;
            maxProfit = Math.max(maxProfit, profit);
            mini = Math.min(mini, prices[i]);
        }
        return maxProfit;
    }
}