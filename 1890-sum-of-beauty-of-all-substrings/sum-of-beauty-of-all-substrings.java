class Solution {
    public int beautySum(String s) {
        int answerCount = 0;

        for (int i = 0; i < s.length(); i++) {
            int[] charCount = new int[26];

            for (int j = i; j < s.length(); j++) {
                charCount[s.charAt(j) - 'a']++;

                int maxFreq = 0;
                int minFreq = Integer.MAX_VALUE;

                for (int count : charCount) {
                    if (count > 0) {
                        maxFreq = Math.max(maxFreq, count);
                        minFreq = Math.min(minFreq, count);
                    }
                }

                answerCount += (maxFreq - minFreq);
            }

        }

        return answerCount;
    }
}