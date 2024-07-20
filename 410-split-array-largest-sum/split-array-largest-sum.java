class Solution {
    public boolean largestSum(int[] nums, int sum, int k) {

        int noOfSum = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (noOfSum + nums[i] > sum) {
                count++;
                noOfSum = nums[i];
            } else {
                noOfSum += nums[i];
            }
        }
        return count <= k;
    }

    public int splitArray(int[] nums, int k) {

        int low = Arrays.stream(nums).max().getAsInt();
        int high = Arrays.stream(nums).sum();

        while (low <= high) {
            int mid = (low + high) / 2;

            if (largestSum(nums, mid, k)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}