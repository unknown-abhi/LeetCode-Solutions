class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num == 1) {
            return false;
        }

        int sum = 1;
        int div = 2;

        while (div <= Math.sqrt(num)) {
            if (num % div == 0) {
                sum += div;

                if (div != num / div) {
                    sum += num / div;
                }
            }
            div++;
        }

        return sum == num;
    }
}