class Solution {
    public int searchInsert(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        int lb = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                lb = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return (lb+1);
    }
}