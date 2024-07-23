class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int size1 = nums1.length;
        int size2 = nums2.length;
        int newSize = size1 + size2;

        int[] ans = new int[newSize];

        int i = 0, j = 0, flag = 0;

        while (i < size1 && j < size2) {

            if (nums1[i] <= nums2[j]) {
                ans[flag] = nums1[i];
                i++;
                flag++;
            } else {
                ans[flag] = nums2[j];
                j++;
                flag++;
            }
        }

        while (i < size1) {
            ans[flag] = nums1[i];
            i++;
            flag++;
        }

        while (j < size2) {
            ans[flag] = nums2[j];
            j++;
            flag++;
        }

        if (newSize % 2 == 0) {
            return (double) (ans[(newSize / 2) - 1] + ans[newSize / 2]) / 2;
        } else {
            return (double) (ans[newSize / 2]);
        }
    }
}