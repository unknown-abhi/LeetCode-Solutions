class Solution {
    public int findGCD(int[] nums) {

        int min = Arrays.stream(nums).min().getAsInt();
        int max = Arrays.stream(nums).max().getAsInt();

        int start = min;

        while (start > 0) {
            if (min % start == 0 && max % start == 0) {
                return start;
            }
            start--;
        }

        return -1;
    }
}