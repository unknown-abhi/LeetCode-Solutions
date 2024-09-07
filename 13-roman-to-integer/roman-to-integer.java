class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanValues = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000);

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            int currentValue = romanValues.get(current);
            if (i + 1 < s.length() && romanValues.containsKey(s.charAt(i + 1))) {
                int nextValue = romanValues.get(s.charAt(i + 1));
                if (currentValue >= nextValue) {
                    result += currentValue;
                } else {
                    result += nextValue - currentValue;
                    i++;
                }
            } else {
                result += currentValue;
            }
        }
        return result;
    }
}