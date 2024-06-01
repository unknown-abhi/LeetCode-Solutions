class Solution {
    public int longestConsecutive(int[] nums) {
        int size = nums.length;
        if (size == 0) {
            return 0;
        }

        Arrays.sort(nums);

        int count = 0;
        int longest = 1;
        int lastLow = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            if (nums[i] - 1 == lastLow) {
                count++;
                lastLow = nums[i];
            } else if (lastLow != nums[i]) {
                count = 1;
                lastLow = nums[i];
            }
            longest = Math.max(count, longest);
        }
        return longest;

    }
}