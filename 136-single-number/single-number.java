class Solution {
    public int singleNumber(int[] nums) {
        int arrSize = nums.length;
        int count = 0;
        for (int i = 0; i < arrSize; i++) {
            for (int j = 0; j < arrSize; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return nums[i];
            }
            count = 0;
        }
        return -1;
    }
}