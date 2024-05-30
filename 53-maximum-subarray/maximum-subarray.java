class Solution {
    public int maxSubArray(int[] nums) {
        
        int sum = 0, maxSum = Integer.MIN_VALUE;
        int i = 0;
        while (i < nums.length) {
            sum += nums[i];
             if (sum > maxSum) {
                maxSum = sum;
            }
             if (sum <= 0) {
                sum = 0;
            }
            i++;
        }

        return maxSum;
    }
}