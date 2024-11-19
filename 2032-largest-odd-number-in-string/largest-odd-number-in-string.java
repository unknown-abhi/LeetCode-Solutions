class Solution {
    public String largestOddNumber(String s) {
        int startIdx = 0;
        int endIdx = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != '0') {
                startIdx = i;
                break;
            }
        }

        int oddCount = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) % 2 != 0) {
                endIdx = i;
                oddCount++;
                break;
            }
        }

        if (oddCount > 0) {
            oddCount = 1;
        }

        return s.substring(startIdx, endIdx + oddCount);
    }
}