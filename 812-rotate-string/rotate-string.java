class Solution {
    public boolean rotateString(String s, String goal) {
        // if (s.length() != goal.length()) {
        //     return false;
        // }

        Queue<Character> q1 = new LinkedList<>();
        Queue<Character> q2 = new LinkedList<>();

        for (char c : s.toCharArray()) {
            q1.add(c);
        }
        for (char c : goal.toCharArray()) {
            q2.add(c);
        }

        int len = q1.size();

        while (len > 0) {
            char tmp = q1.peek();
            q1.poll();
            q1.add(tmp);

            if (q1.equals(q2)) {
                return true;
            }
            len--;
        }

        return false;
    }
}