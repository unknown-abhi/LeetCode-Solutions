class Solution {
    public int longestConsecutive(int[] nums) {
        int size = nums.length;
        if (size == 0) {
            return 0;
        }
        int longest = 1;

        Set<Integer> arr = new HashSet<>();
        for (int i = 0; i < size; i++) {
            arr.add(nums[i]);
        }

        Iterator<Integer> value = arr.iterator();

        while (value.hasNext()) {
            int curr = value.next();
            int count = 1;
            while (!arr.contains(curr - 1)) {
                if (arr.contains(curr + count)) {
                    count++;
                } else {
                    break;
                }
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
}