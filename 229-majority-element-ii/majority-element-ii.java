class Solution {
    public List<Integer> majorityElement(int[] nums) {

        HashMap<Integer, Integer> mp = new HashMap<>();
        int size = nums.length;

        Set<Integer> temp = new HashSet<>();
        int nBy3 = size / 3;

        for (int i = 0; i < size; i++) {
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);

            if (mp.get(nums[i]) > nBy3) {
                temp.add(nums[i]);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>(temp);
        return ans;
    }
}