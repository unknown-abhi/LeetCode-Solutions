class Solution {
    public String longestCommonPrefix(String[] str) {
        if (str == null || str.length == 0) {
            return "";
        }

        Arrays.sort(str);
        String first = str[0];
        String last = str[str.length - 1];
        int count = 0;

        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                break;
            }
            count++;
        }

        return first.substring(0, count);
    }
}