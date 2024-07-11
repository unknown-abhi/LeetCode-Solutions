class Solution {
    public int singleNonDuplicate(int[] nums) {

        int arrSize = nums.length;
        if (arrSize == 1)
            return nums[0];
        if (nums[0] != nums[1])
            return nums[0];
        if (nums[arrSize - 1] != nums[arrSize - 2])
            return nums[arrSize - 1];

        int low = 1;
        int high = arrSize - 2;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }

            if (mid % 2 == 1 && nums[mid] == nums[mid - 1] || mid % 2 == 0 && nums[mid] == nums[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}