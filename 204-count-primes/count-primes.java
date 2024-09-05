class Solution {
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }

        int[] ans = new int[n + 1];
        Arrays.fill(ans, 1);

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (ans[i] == 1) {
                for (int j = i * i; j <= n; j += i) {
                    ans[j] = 0;
                }
            }
        }

        int count = 0;
        for (int i = n - 1; i >= 2; i--) {
            if (ans[i] == 1) {
                count++;
            }
        }

        return count;
    }
}