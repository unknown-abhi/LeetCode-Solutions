class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> nonDuplicateArr = new LinkedHashSet<>();

        for (int i = 0; i < nums.length; i++) {
            nonDuplicateArr.add(nums[i]);
        }
        int i = 0;
        for (int temp : nonDuplicateArr) {
            nums[i] = temp;
            i++;
        }

        return nonDuplicateArr.size();
    }
}