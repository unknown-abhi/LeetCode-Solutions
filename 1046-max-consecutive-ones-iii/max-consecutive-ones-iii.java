class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxLen = 0;
        int l = 0;
        int r = 0;
        int zeros = 0;

        while(r < nums.length){

            if(nums[r] == 0){
                zeros++;
            }

            if(zeros > k){

                if(nums[l] == 0){
                    zeros--;
                }
                l++;
            }

            if(zeros <= k){
                int len = (r - l) + 1;
                maxLen = Math.max(maxLen, len);
            }
            r++;
        }

        return maxLen;
    }
}