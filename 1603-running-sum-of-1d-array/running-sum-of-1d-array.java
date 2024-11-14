class Solution {
    public int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];
        int tmp = 0;

        for (int i = 0; i < nums.length; i++) {
            tmp += nums[i];
            sum[i] = tmp;
        }

        return sum;
    }
}