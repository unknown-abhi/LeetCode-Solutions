class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        
        int arrSize = names.length;

        for(int i = 0; i < arrSize; i++){
            for(int j = i + 1; j < arrSize; j++){
                if(heights[i] < heights[j])
                {
                    String tmpName = names[i];
                    names[i] = names[j];
                    names[j] = tmpName;

                    int height = heights[i];
                    heights[i] = heights[j];
                    heights[j] = height;
                }
            }
        }

        return names;
    }
}