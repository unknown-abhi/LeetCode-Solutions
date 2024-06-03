class Solution {
    public void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            Integer[] row = Arrays.stream(matrix[i]).boxed().toArray(Integer[]::new);
            Collections.reverse(Arrays.asList(row));
            matrix[i] = Arrays.stream(row).mapToInt(Integer::intValue).toArray();
        }
    }
}