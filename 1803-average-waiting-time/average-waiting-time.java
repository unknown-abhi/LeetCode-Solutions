class Solution {
    public double averageWaitingTime(int[][] customers) {
        double totalCust = customers.length;

        double idealTime = 1;
        double totalWaitTime = 0;

        for (int customer[] : customers) {

            // Chef Free
            if (idealTime <= customer[0]) {
                idealTime = customer[0] + customer[1];
            } else { // Chef Not Free
                idealTime = idealTime + customer[1];
            }

            totalWaitTime += idealTime - customer[0];
        }

        return totalWaitTime / totalCust;
    }
}