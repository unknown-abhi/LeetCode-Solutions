class Solution {
    public int removeDuplicates(int[] nums) {
        int isDuplicateCount = 0;
        int arrSize = nums.length;

        for (int i = 0; i < arrSize - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                isDuplicateCount++;
                for (int j = i + 1; j < arrSize - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                arrSize--;
                i--;
            }
        }

        return nums.length - isDuplicateCount;
    }
}