class Solution {
    public void rotate(int[] nums, int k) {
        int arrSize = nums.length;
        k = k % arrSize;

        reverse(nums, 0, arrSize - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, arrSize - 1);
    }

    private static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}