import java.util.*;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] ans = new int[m + n];

        int left = 0;
        int right = 0;
        int flag = 0;

        while (left < m && right < n) {
            if (nums1[left] <= nums2[right]) {
                ans[flag] = nums1[left];
                left++;
                flag++;
            } else {
                if (right < n) {
                    ans[flag] = nums2[right];
                    right++;
                    flag++;
                }
            }
        }

        while (left < m) {
            ans[flag] = nums1[left];
            left++;
            flag++;
        }
        while (right < n) {
            ans[flag] = nums2[right];
            right++;
            flag++;
        }

        for (int i = 0; i < m + n; i++) {
            nums1[i] = ans[i];
        }
    }
}