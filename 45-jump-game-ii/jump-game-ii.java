class Solution {
    public int jump(int[] nums) {
        if (nums[0] == 0 && nums.length > 1) {
            return -1;
        }if(nums.length == 1){
            return 0;
        }

        int maxReach = 0;
        int maxJump = 0;
        int minimumJump = 0;

        for (int i = 0; i < nums.length; i++) {
            maxJump = Math.max(maxJump, nums[i] + i);

            if (maxReach == i) {
                maxReach = maxJump;
                minimumJump++;
                if (maxReach >= nums.length - 1) {
                    return minimumJump;
                }
            }
        }

        return -1;
    }
}