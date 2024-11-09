class Solution {
    public int countDigits(int num) {
        int count = 0;
        int tmp = num;
        while (num > 0) {
            int rem = num % 10;
            if (tmp % rem == 0) {
                count++;
            }
            num /= 10;
        }

        return count;
    }
}