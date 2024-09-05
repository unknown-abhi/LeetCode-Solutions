class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        // Optimal Solution
        return (s + s).contains(goal);

        //Better Solution
        // StringBuffer sb = new StringBuffer(s);

        // int len = s.length();

        // while (len > 0) {
        //     char tmp = sb.charAt(0);
        //     sb.deleteCharAt(0);
        //     sb.append(tmp);

        //     if (sb.toString().equals(goal)) {
        //         return true;
        //     }
        //     len--;
        // }
        // return false;
    }
}