class Solution {
    public int smallestRangeI(int[] nums, int k) {
        
        int min = nums[0];
        int max = nums[0];

        for(int i = 0; i < nums.length; i++){
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        if((max - k) - (min + k) <= 0){
            return 0;
        }else {
            return (max - k) - (min + k);
        }
    }
}