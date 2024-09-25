class Solution {
    public double averageWaitingTime(int[][] customers) {
        double totalCust = customers.length;

        double idealTime = 1;
        double totalWaitTime = 0;

        for (int i = 0; i < totalCust; i++) {

            if (idealTime <= customers[i][0]) {
                idealTime = customers[i][0] + customers[i][1];
            } else {
                idealTime = idealTime + customers[i][1];
            }

            totalWaitTime += idealTime - customers[i][0];
        }

        return totalWaitTime / totalCust;
    }
}