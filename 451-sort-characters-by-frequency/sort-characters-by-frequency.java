class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>(
                (c1, c2) -> c2.getValue() - c1.getValue());

        maxHeap.addAll(charCount.entrySet());

        StringBuilder result = new StringBuilder();

        while (!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> entry = maxHeap.poll();
            for (int i = 0; i < entry.getValue(); i++) {
                result.append(entry.getKey());
            }
        }
        return result.toString();
    }

}