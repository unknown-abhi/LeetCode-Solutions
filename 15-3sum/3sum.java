class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> st = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]){
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    List<Integer> list = Arrays.asList(nums[i],nums[j],nums[k]);
                    // list.add(nums[i]);
                    // list.add(nums[j]);
                    // list.add(nums[k]);
                    st.add(list);
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j-1]) j++;
                    while (j < k && nums[k] == nums[k+1]) k--;

                } else if (nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        // List<List<Integer>> ans = new ArrayList<>(st);
        return st;
    }
}