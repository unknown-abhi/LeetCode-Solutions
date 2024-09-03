class Solution {
    public String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);

        char[] shortest = strs[0].toCharArray();
        char[] longest = strs[strs.length - 1].toCharArray();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < shortest.length; i++) {
            if (shortest[i] == longest[i]) {
                sb.append(shortest[i]);
            } else {
                break;
            }
        }
        return sb.toString();
    }
}