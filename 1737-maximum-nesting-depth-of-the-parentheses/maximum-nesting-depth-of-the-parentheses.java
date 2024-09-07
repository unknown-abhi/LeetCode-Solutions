class Solution {
    public int maxDepth(String s) {
        int maxDepth = 0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.add('(');
                maxDepth = Math.max(maxDepth, stack.size());
            } else if (s.charAt(i) == ')') {
                stack.pop();
            }
        }
        return maxDepth;
    }
}