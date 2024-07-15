class Solution {
    public boolean minCapacity(int[] weights, int days, int minWeight) {

        int noOfDays = 0;
        int count = 0;

        for (int i = 0; i < weights.length; i++) {
            count += weights[i];

            if (count == minWeight) {
                noOfDays++;
                count = 0;
            } else if (count > minWeight) {
                noOfDays++;
                count = weights[i];
            }
        }

        if (count < minWeight && count != 0) {
            noOfDays++;
        }

        return noOfDays <= days;
    }

    public int shipWithinDays(int[] weights, int days) {

        int low = Arrays.stream(weights).max().getAsInt();
        int high = Arrays.stream(weights).sum();

        // int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (minCapacity(weights, days, mid)) {
                // ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}