class Solution {
    public int maxProduct(int[] nums) {

        double max = Integer.MIN_VALUE;
        double prefix = 1;
        double suffix = 1;
        int arrSize = nums.length;

        for (int i = 0; i < arrSize; i++) {

            prefix = prefix * nums[i];
            suffix = suffix * nums[arrSize - i - 1];

            max = Math.max(max, Math.max(prefix, suffix));

            if (nums[i] == 0) {
                prefix = 1;
            }

            if (nums[arrSize - i - 1] == 0) {
                suffix = 1;
            }
        }

        return (int)max;
    }
}