class Solution {
    public boolean minPossible(int[] bloomDay, int day, int m, int k) {

        int noOfDay = 0;
        int count = 0;

        for (int i = 0; i < bloomDay.length; i++) {
            if (day >= bloomDay[i]) {
                count++;
            } else {
                noOfDay += count / k;
                count = 0;
            }
        }
        noOfDay += count / k;

        return (noOfDay >= m) ? true : false;
    }

    public int minDays(int[] bloomDay, int m, int k) {

        if ((m * k) > bloomDay.length) {
            return -1;
        }

        int low = Arrays.stream(bloomDay).min().getAsInt();
        int high = Arrays.stream(bloomDay).max().getAsInt();

        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (minPossible(bloomDay, mid, m, k)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }

        return ans;
    }
}