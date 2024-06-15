class Solution {
    public int countSubstrings(String s) {

        List<String> st = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            int left = i;
            int right = i;
            // Odd
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                st.add(s.substring(left, right + 1));
                left--;
                right++;
            }
            left = i;
            right = i+1;
            // Even
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                st.add(s.substring(left, right + 1));
                left--;
                right++;
            }
        }
        return st.size();
    }
}