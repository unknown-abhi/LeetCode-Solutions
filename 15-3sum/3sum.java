class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> st = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            Set<Integer> temp = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++) {
                int k = -(nums[i] + nums[j]);
                if (temp.contains(k)) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(k);
                    st.add(list);
                }
                temp.add(nums[j]);
            }
        }
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }
}