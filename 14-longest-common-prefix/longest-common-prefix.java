class Solution {
    public String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);

        String shortest = strs[0];
        String longest = strs[strs.length - 1];

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < shortest.length(); i++) {
            if (shortest.charAt(i) == longest.charAt(i)) {
                sb.append(shortest.charAt(i));
            }else{
                break;
            }
        }
        return sb.toString();
    }
}