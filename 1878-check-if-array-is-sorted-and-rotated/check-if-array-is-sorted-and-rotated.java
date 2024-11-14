class Solution {
    public boolean check(int[] nums) {
        if (nums.length <= 2) {
            return true;
        }

        int count = 0;
        int size = nums.length;

        if (nums[0] < nums[size - 1]) {
            count++;
        }

        for (int i = 0; i < size - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                count++;
            }

            if(count > 1){
                return false;
            }
        }


        return true;
    }
}