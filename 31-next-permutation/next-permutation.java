class Solution {
    public void nextPermutation(int[] nums) {

        int size = nums.length;

        int breakpoint = -1;

        for (int i = size - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                breakpoint = i;
                break;
            }
        }

        if (breakpoint != -1) {
            for (int i = size - 1; i >= breakpoint; i--) {
                if (nums[i] > nums[breakpoint]) {
                    int temp = nums[i];
                    nums[i] = nums[breakpoint];
                    nums[breakpoint] = temp;
                    break;
                }
            }

           Arrays.sort(nums, breakpoint + 1, size);
        } else {
            Arrays.sort(nums);
        }
    }
}