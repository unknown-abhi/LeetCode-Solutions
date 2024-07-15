class Solution {
    public boolean minCapacity(int[] weights, int days, int minWeight) {

        int noOfDays = 1;
        int load = 0;

        for (int i = 0; i < weights.length; i++) {
            // load += weights[i];

            // if (count == minWeight) {
            // noOfDays++;
            // load = 0;
            // } else if (count > minWeight) {
            // noOfDays++;
            // load = weights[i];
            // }

            if (load + weights[i] > minWeight) {
                noOfDays++;
                load = weights[i];
            } else {
                load += weights[i];
            }
        }

        // if (load < minWeight && load != 0) {
        // noOfDays++;
        // }

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