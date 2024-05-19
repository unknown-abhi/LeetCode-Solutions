class Solution {
    public boolean check(int[] nums) {
        if (nums.length <= 2) {
            return true;
        }
        int count = 0;
        int size = nums.length;
        for (int i = 0; i < size - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                count++;
            }
        }
        if (nums[0] < nums[size - 1]) {
            count++;
        }
        return count <= 1;
    }
}