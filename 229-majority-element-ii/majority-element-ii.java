class Solution {
    public List<Integer> majorityElement(int[] nums) {

        HashMap<Integer, Integer> mp = new HashMap<>();
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }

        ArrayList<Integer> ans = new ArrayList<>();
        int nBy3 = size / 3;
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (entry.getValue() > nBy3) {
                ans.add(entry.getKey());
            }
        }

        return ans;
    }
}