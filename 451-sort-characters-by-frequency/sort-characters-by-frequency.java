class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> mp = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0) + 1);
        }

        StringBuilder sb = new StringBuilder();

        while (!mp.isEmpty()) {
            int max = -1;
            char tmpChar = '\0';
            for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
                int tmpMax = -1;
                tmpMax = Math.max(tmpMax, entry.getValue());
                if (tmpMax >= max) {
                    max = tmpMax;
                    tmpChar = entry.getKey();
                    tmpMax = -1;
                }
            }

            for (int i = 0; i < max; i++) {
                sb.append(tmpChar);
            }
            mp.remove(tmpChar);
        }

        return sb.toString();
    }
}