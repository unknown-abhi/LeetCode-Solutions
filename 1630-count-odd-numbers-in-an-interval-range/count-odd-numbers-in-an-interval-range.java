class Solution {
    public int countOdds(int low, int high) {

        int rem = high - low;

        if (rem % 2 == 0 && high % 2 != 0) {
            return (rem / 2) + 1;
        } else if (rem % 2 != 0) {
            return (rem / 2) + 1;
        } else {
            return rem / 2;
        }
    }
}