class Solution {
    public boolean canJump(int[] nums) {
        if (nums[0] == 0 && nums.length > 1) {
            return false;
        }

        int maxReach = 0;
        int maxJump = 0;

        for (int i = 0; i < nums.length; i++) {
            maxJump = Math.max(maxJump, nums[i] + i);

            if (maxReach == i) {
                maxReach = maxJump;
                if (maxReach >= nums.length - 1) {
                    return true;
                }
            }
        }

        return false;
    }
}