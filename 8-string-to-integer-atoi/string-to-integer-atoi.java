class Solution {

    public int myAtoi(String s) {
        int MIN = Integer.MIN_VALUE;
        int MAX = Integer.MAX_VALUE;

        s = s.strip();
        
        if (s.length() == 0) {
            return 0;
        }

        int sign = 1;
        int start = 0;

        if (s.charAt(0) == '-') {
            sign = -1;
            start++;
        } else if (s.charAt(0) == '+') {
            start++;
        }

        long ans = 0;

        for (int i = start; i < s.length(); i++) {
            char currentCharacter = s.charAt(i);

            if (!Character.isDigit(currentCharacter)) {
                break;
            } else {
                ans = ans * 10 + (currentCharacter - '0');
                if (sign == 1) {
                    if (ans > MAX) {
                        return MAX;
                    }
                } else {
                    if (-1 * ans < MIN) {
                        return MIN;
                    }
                }
            }
        }
        return (int) (sign * ans);
    }
}