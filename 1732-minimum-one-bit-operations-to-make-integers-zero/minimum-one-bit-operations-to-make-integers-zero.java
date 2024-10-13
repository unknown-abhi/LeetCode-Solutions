class Solution {
    public int minimumOneBitOperations(int n) {
        // Initialize ans to 0, which will hold the result (minimum operations)
        int ans = 0;

        // Loop until n becomes 0
        while (n > 0) {
            // Perform XOR between ans and n
            // This simulates the toggling effect to count the number of operations needed
            ans ^= n;

            // Right shift n by 1 (equivalent to dividing n by 2)
            // This reduces the problem by removing the least significant bit of n
            n >>= 1;
        }

        // Return the result, which is the minimum number of operations to reduce n to 0
        return ans;
    }
}