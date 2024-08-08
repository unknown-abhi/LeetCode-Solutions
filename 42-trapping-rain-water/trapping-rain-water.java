class Solution {
    public int trap(int[] height) {

        int leftMax = 0;
        int rightMax = 0;
        int total = 0;

        int low = 0;
        int high = height.length - 1;

        while (low < high) {

            if (height[low] <= height[high]) {
                if (leftMax > height[low]) {

                    total += leftMax - height[low];
                } else {
                    leftMax = height[low];
                }
                low++;
            } else {
                if (rightMax > height[high]) {

                    total += rightMax - height[high];
                } else {
                    rightMax = height[high];
                }
                high--;
            }
        }

        return total;
    }
}