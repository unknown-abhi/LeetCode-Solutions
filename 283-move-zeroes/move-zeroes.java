class Solution {
    public void moveZeroes(int[] nums) {
        int initial = -1;
        int arrSize = nums.length;

        for (int i = 0; i < arrSize; i++) {
            if (nums[i] == 0) {
                initial = i;
                break;
            }
        }
        if (initial > -1) {
            for (int i = initial; i < arrSize; i++) {
                if (nums[i] != 0) {
                    int temp = nums[initial];
                    nums[initial] = nums[i];
                    nums[i] = temp;
                    initial++;
                }
            }
        }
    }
}