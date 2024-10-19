class Solution {

    private long MOD = 1000000007;

    public int countGoodNumbers(long n) {
        long even = (n + 1) / 2;
        long odd = n / 2;

        int ans = (int) ((pow(5, even) * pow(4, odd)) % MOD);

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