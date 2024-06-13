import java.util.*;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] ans = new int[m + n];

        int left = 0;
        int right = 0;
        int index = 0;

        while (left < m && right < n) {
            if (nums1[left] <= nums2[right]) {
                ans[index] = nums1[left];
                left++;
                index++;
            } else {
                if (right < n) {
                    ans[index] = nums2[right];
                    right++;
                    index++;
                }
            }
        }

        while (left < m) {
            ans[index] = nums1[left];
            left++;
            index++;
        }
        while (right < n) {
            ans[index] = nums2[right];
            right++;
            index++;
        }

        for (int i = 0; i < m + n; i++) {
            nums1[i] = ans[i];
        }
    }
}