class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++) {
            char firstChar = sb.charAt(0);
            for (int j = 1; j < s.length(); j++) {
                sb.setCharAt(j - 1, sb.charAt(j));
            }
            sb.setCharAt(s.length() - 1, firstChar);
            if (sb.toString().equals(goal)) {
                return true;
            }
        }
        return false;
    }
}