class Solution {
    public int maxProfit(int[] prices) {

        int mini = prices[0];
        int maxProfit = 0;
        int size = prices.length;

        for (int i = 1; i < size; i++) {
            int profit = prices[i] - mini;
            maxProfit = Math.max(maxProfit, profit);
            mini = Math.min(mini, prices[i]);
        }
        return maxProfit;
    }
}