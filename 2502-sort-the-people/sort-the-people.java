class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        
        Map<Integer, String> mp = new TreeMap<>(Comparator.reverseOrder());

        for (int i = 0; i < names.length; i++) {
            mp.put(heights[i], names[i]);
        }

        int i = 0;
        for(String value : mp.values()){
            names[i++] = value;
        }

        return names;
    }
}