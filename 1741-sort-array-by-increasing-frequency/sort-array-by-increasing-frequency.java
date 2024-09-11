class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> frequencyMap = new LinkedHashMap<>();

        Arrays.sort(nums);
        int[] reverseNums = IntStream.rangeClosed(1, nums.length).map(i -> nums[nums.length - i]).toArray();

        for (int i : reverseNums) {
            frequencyMap.put(i, frequencyMap.getOrDefault(i, 0) + 1);
        }
        List<Integer> list = new ArrayList<>(frequencyMap.keySet());
        list.sort((l1, l2) -> frequencyMap.get(l1).compareTo(frequencyMap.get(l2)));

        int indx = 0;
        for (int i : list) {
            int j = 0;
            while (j < frequencyMap.get(i)) {
                reverseNums[indx] = i;
                indx++;
                j++;
            }
        }

        return reverseNums;
    }
}