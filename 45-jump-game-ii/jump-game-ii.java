class Solution {
    public int jump(int[] nums) {
        int arrSize = nums.length;

        if (nums[0] == 0 && arrSize > 1) {
            return -1;
        }
        if (arrSize == 1) {
            return 0;
        }

        int maxReach = 0;
        int maxJump = 0;
        int minimumJump = 0;

        for (int i = 0; i < arrSize; i++) {

            maxJump = Math.max(maxJump, nums[i] + i);

            if (maxReach == i) {
                maxReach = maxJump;
                minimumJump++;
                if (maxReach >= arrSize - 1) {
                    return minimumJump;
                }
            }
        }

        return -1;
    }
}