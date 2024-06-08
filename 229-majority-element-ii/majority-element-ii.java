class Solution {
    public List<Integer> majorityElement(int[] nums) {

        Arrays.sort(nums);
        HashMap<Integer, Integer> mp = new HashMap<>();
        int size = nums.length;

        ArrayList<Integer> ans = new ArrayList<>();
        int nBy3 = size / 3;
        int last = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);

            if (mp.get(nums[i]) > nBy3 && last != nums[i]) {
                last = nums[i];
                ans.add(last);
            }
        }

        return ans;
    }
}