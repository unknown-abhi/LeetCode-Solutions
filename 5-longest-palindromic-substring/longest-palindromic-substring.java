class Solution {
    private String isPalindrom(String s, int i, int j) {

        String result = "";
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            result = s.substring(i, j + 1);
            i--;
            j++;
        }

        return result;
    }

    public String longestPalindrome(String s) {
        String longestSubString = "";

        for (int i = 0; i < s.length(); i++) {
            String str1 = isPalindrom(s, i, i);
            String str2 = isPalindrom(s, i, i + 1);

            String tmp = str1.length() >= str2.length() ? str1 : str2;
            longestSubString = tmp.length() > longestSubString.length() ? tmp : longestSubString;
        }

        return longestSubString;
    }
}