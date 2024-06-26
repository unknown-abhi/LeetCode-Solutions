class Solution {
    public int[][] merge(int[][] intervals) {

        int n = intervals.length;

        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            if (!list.isEmpty() && start <= list.get(list.size() - 1).get(1)) {
                list.get(list.size() - 1).set(1, Math.max(list.get(list.size() - 1).get(1), end));
                continue;
            }
            
            list.add(Arrays.asList(start, end));
        }

        int[][] ans = list.stream().map(x -> x.stream().mapToInt(i -> i).toArray()).toArray(int[][]::new);

        return ans;
    }
}