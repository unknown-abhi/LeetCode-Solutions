class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        List<Character> characters = new ArrayList<>(frequencyMap.keySet());
        // Collections.sort(characters, new Comparator<Character>() {
        // @Override
        // public int compare(Character c1, Character c2) {
        // return frequencyMap.get(c2) - frequencyMap.get(c1);
        // }
        // });
        characters.sort((c1, c2) -> frequencyMap.get(c2) - frequencyMap.get(c1));

        StringBuilder result = new StringBuilder();
        for (char c : characters) {
            for (int i = 0; i < frequencyMap.get(c); i++) {
                result.append(c);
            }
        }
        return result.toString();
    }
    // public String frequencySort(String s) {
    // Map<Character, Integer> mp = new TreeMap<>();
    // for (int i = 0; i < s.length(); i++) {
    // mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0) + 1);
    // }

    // StringBuilder sb = new StringBuilder();

    // while (!mp.isEmpty()) {
    // int max = -1;
    // char tmpChar = '\0';
    // for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
    // int tmpMax = -1;
    // tmpMax = Math.max(tmpMax, entry.getValue());
    // if (tmpMax >= max) {
    // max = tmpMax;
    // tmpChar = entry.getKey();
    // tmpMax = -1;
    // }
    // }

    // for (int i = 0; i < max; i++) {
    // sb.append(tmpChar);
    // }
    // mp.remove(tmpChar);
    // }

    // return sb.toString();
    // }
}