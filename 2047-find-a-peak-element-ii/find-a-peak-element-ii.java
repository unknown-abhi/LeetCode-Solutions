class Solution {
    public int findMaxRow(int[][] mat, int col) {

        int max = -1;
        int index = -1;

        for (int i = 0; i < mat.length; i++) {
            if (mat[i][col] > max) {
                max = mat[i][col];
                index = i;
            }
        }

        return index;
    }

    public int[] findPeakGrid(int[][] mat) {

        int colCount = mat[0].length;
        int low = 0;
        int high = colCount - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int maxRow = findMaxRow(mat, mid);

            int left = (mid - 1 >= 0) ? mat[maxRow][mid - 1] : -1;
            int right = (mid + 1 < colCount) ? mat[maxRow][mid + 1] : -1;

            if (mat[maxRow][mid] > left && mat[maxRow][mid] > right) {
                return new int[] { maxRow, mid };
            } else if (mat[maxRow][mid] < left) {
                high = mid - 1;
                // low = mid + 1;
            } else {
                low = mid + 1;
                // high = mid - 1;
            }
        }

        return new int[] { -1, -1 };
    }
}