class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int size = piles.length;

        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt();

        while (low <= high) {
            int mid = (low + high) / 2;
            int total = 0;

            for (int i = 0; i < size; i++) {
                total += Math.ceil((double) piles[i] / (double) mid);
            }

            if (total <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}