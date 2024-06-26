class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> twoSumArr = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (twoSumArr.containsKey(complement)) {
                return new int[] { twoSumArr.get(complement), i };
            }
            twoSumArr.put(nums[i], i);
        }
        return new int[] { -1, -1 };
}
}