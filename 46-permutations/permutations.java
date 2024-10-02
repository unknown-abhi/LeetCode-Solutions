class Solution {
    public void permutation(int[] num, List<Integer> ans, Set<List<Integer>> result) {
        if (num.length == 0) {
            result.add(new ArrayList<>(ans));
            return;
        }

        for (int i = 0; i < num.length; i++) {
            int curr = num[i];

            // Create a new array excluding the current element
            int[] remaining = new int[num.length - 1];

            for (int j = 0, k = 0; j < num.length; j++) {
                if (j != i) {
                    remaining[k++] = num[j];
                }
            }

            // Add the current element to the answer list
            ans.add(curr);
            permutation(remaining, ans, result);

            // Backtrack by removing the last added element
            ans.remove(ans.size() - 1);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        Set<List<Integer>> result = new HashSet<>(); // Using TreeSet to store sorted unique permutations
        List<Integer> ans = new ArrayList<>();
        permutation(nums, ans, result);
        return new ArrayList<>(result); // Converting Set to List
    }
}