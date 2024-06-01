class Solution {
    public int[] rearrangeArray(int[] nums) {
        int size = nums.length;

        List<Integer> positiveNums = new ArrayList<>();
        List<Integer> negativeNums = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            if (nums[i] > 0) {
                positiveNums.add(nums[i]);
            } else {
                negativeNums.add(nums[i]);
            }
        }

        int pos = 0;
        int neg = 0;
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                nums[i] = positiveNums.get(pos);
                pos++;
            } else {
                nums[i] = negativeNums.get(neg);
                neg++;
            }
        }

        return nums;
    }
}