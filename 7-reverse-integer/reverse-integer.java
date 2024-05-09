class Solution {
    public int reverse(int x) {

        int rev = 0;
        while (Math.abs(x) > 0) {
            int max = (Integer.MAX_VALUE - Math.abs(x % 10)) / 10;
            int min = (Integer.MIN_VALUE + Math.abs(x % 10)) / 10;
            if (rev > max || rev < min) {
                return 0;
            }
            rev = rev * 10 + (x % 10);
            x = x / 10;
        }

        return rev;
    }
}