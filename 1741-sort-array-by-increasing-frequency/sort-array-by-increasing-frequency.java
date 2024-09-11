class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> frequencyMap = new LinkedHashMap<>();

        Arrays.sort(nums);

        for (int i = nums.length - 1; i >= 0; i--) {
            frequencyMap.put(nums[i], frequencyMap.getOrDefault(nums[i], 0) + 1);
        }
        List<Integer> list = new ArrayList<>(frequencyMap.keySet());
        list.sort((l1, l2) -> frequencyMap.get(l1).compareTo(frequencyMap.get(l2)));

        int indx = 0;
        for (int i : list) {
            int j = 0;
            while (j < frequencyMap.get(i)) {
                nums[indx] = i;
                indx++;
                j++;
            }
        }

        return nums;
    }
}