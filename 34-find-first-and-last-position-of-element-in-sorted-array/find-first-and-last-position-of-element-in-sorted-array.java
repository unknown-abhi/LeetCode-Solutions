class Solution {
    public int lowerBound(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int lb = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                lb = mid;
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return lb;
    }

    public int upperBound(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int ub = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                ub = mid;
                low = mid + 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ub;
    }

    public int[] searchRange(int[] nums, int target) {

        return new int[] { lowerBound(nums, target), upperBound(nums, target)};
    }
}