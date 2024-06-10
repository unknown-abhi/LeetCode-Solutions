class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        Set<List<Integer>> st = new HashSet<>();
        Arrays.sort(nums);

        int size = nums.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                Set<Integer> tmpSt = new HashSet<>();
                for (int k = j + 1; k < size; k++) {
                    int forth = target - (nums[i] + nums[j] + nums[k]);

                    if (tmpSt.contains(forth)
                            && (long) nums[i] + (long) nums[j] + (long) nums[k] + (long) forth == target) {
                        List<Integer> tmp = new ArrayList<>();
                        tmp.add(nums[i]);
                        tmp.add(nums[j]);
                        tmp.add(nums[k]);
                        tmp.add(forth);
                        st.add(tmp);
                    }
                    tmpSt.add(nums[k]);

                }

            }

        }

        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }
}