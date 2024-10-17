class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
        return 1.0; // Base case: anything raised to the power 0 is 1
    }

    long pow = Math.abs((long)n); // Use long to handle Integer.MIN_VALUE correctly
    double result = 1.0;

    while (pow > 0) {
        if ((pow & 1) == 1) { // If pow is odd, multiply result by x
            result *= x;
        }
        x *= x; // Square the base
        pow >>= 1; // Divide pow by 2
    }

    return (n < 0) ? 1.0 / result : result; // Handle negative exponents by returning reciprocal

    }
}