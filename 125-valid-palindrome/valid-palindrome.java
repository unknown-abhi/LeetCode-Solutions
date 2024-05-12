class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
        	return true;
        }
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder newString = new StringBuilder(s);
        newString.reverse();
        return s.equals(newString.toString());
    }
}