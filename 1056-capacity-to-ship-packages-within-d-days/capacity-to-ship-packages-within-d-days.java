class Solution {
    public boolean minCapacity(int[] weights, int days, int minWeight) {

        int noOfDays = 1;
        int load = 0;

        for (int i = 0; i < weights.length; i++) {

            if (load + weights[i] > minWeight) {
                noOfDays++;
                load = weights[i];
            } else {
                load += weights[i];
            }
        }

        return noOfDays <= days;
    }

    public int shipWithinDays(int[] weights, int days) {

        int low = Arrays.stream(weights).max().getAsInt();
        int high = Arrays.stream(weights).sum();

        while (low <= high) {
            int mid = (low + high) / 2;

            if (minCapacity(weights, days, mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}