class Solution {
    public int subarraySum(int[] nums, int k) {

        int count = 0;
        HashMap<Integer, Integer> maxSubArr = new HashMap<>();
        maxSubArr.put(0, 1);
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int remove = sum - k;
            count += maxSubArr.getOrDefault(remove, 0);
            maxSubArr.put(sum, maxSubArr.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}