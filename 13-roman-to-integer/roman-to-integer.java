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

        int n = s.length();
        int result = 0;

        for (int i = 0; i < n; i++) {
            char current = s.charAt(i);
            int currentValue = romanValues.get(current);

            if (i + 1 < n && currentValue < romanValues.get(s.charAt(i + 1))) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
        }

        // for (int i = 0; i < n; i++) {
        // char current = s.charAt(i);
        // int currentValue = romanValues.get(current);
        // if (i + 1 < n && romanValues.containsKey(s.charAt(i + 1))) {
        // int nextValue = romanValues.get(s.charAt(i + 1));
        // if (currentValue >= nextValue) {
        // result += currentValue;
        // } else {
        // result += nextValue - currentValue;
        // i++;
        // }
        // } else {
        // result += currentValue;
        // }
        // }

        return result;
    }
}