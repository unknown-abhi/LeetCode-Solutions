class Solution {
    public int missingNumber(int[] nums) {
        int size = nums.length;
        Arrays.sort(nums);

        while (size > 0) {
            if (nums[size - 1] != size) {
                return size;
            }
            size--;
        }
        return size;
    }
}