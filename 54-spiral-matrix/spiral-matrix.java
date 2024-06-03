class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> newMatrix = new ArrayList<>();

        int rows = matrix.length;
        int coloums = matrix[0].length;

        int top = 0, right = coloums - 1;
        int bottom = rows - 1, left = 0;

        while (left <= right && top <= bottom) {

            for (int i = top; i <= right; i++) {
                newMatrix.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                newMatrix.add(matrix[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    newMatrix.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    newMatrix.add(matrix[i][left]);
                }
                left++;
            }
        }
        return newMatrix;
    }
}