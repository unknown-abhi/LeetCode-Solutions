class Solution {
    public void moveZeroes(int[] nums) {
        int initial = 0;
        int arrSize = nums.length;

        for (int i = 0; i < arrSize; i++) {
            if (nums[i] != 0) {
                int temp = nums[initial];
                nums[initial] = nums[i];
                nums[i] = temp;
                initial++;
            }
        }
    }
}