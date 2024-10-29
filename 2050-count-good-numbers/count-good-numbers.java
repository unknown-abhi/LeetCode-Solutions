class Solution {

    private long MOD = 1000000007;

    public int countGoodNumbers(long n) {
        long evenIdx = (n + 1) / 2;
        long oddIdx = n / 2;

        int ans = (int) ((pow(5, evenIdx) * pow(4, oddIdx)) % MOD);

        return ans;
    }

    private long pow(long x, long y) {
        if (y == 0) {
            return 1;
        }

        long tmp = pow(x, y / 2);

        if (y % 2 == 0) {
            return (tmp * tmp) % MOD;
        } else {
            return (x * tmp * tmp) % MOD;
        }

    }
}