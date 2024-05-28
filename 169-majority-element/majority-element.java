class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> ele = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (ele.containsKey(nums[i])) {
                ele.put(nums[i], ele.get(nums[i]) + 1);
            } else {
                ele.put(nums[i], 1);
            }
        }

        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : ele.entrySet()) {
            if (entry.getValue() > n / 2) {
                ans = entry.getKey();
                break;
            }
        }
        return ans;
    }
}