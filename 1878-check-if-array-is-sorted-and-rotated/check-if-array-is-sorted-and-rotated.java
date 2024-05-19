class Solution {
    public boolean check(int[] nums) {
        if (nums.length <= 2) {
            return true;
        }
        boolean flag = false;

        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        int secondCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                arr1.add(nums[i]);
                return true;
            } else if (nums[i] <= nums[i + 1]) {
                arr1.add(nums[i]);
            } else if (nums[i] > nums[i + 1]) {
                arr1.add(nums[i]);
                secondCount = i;
                break;
            }
        }
        for (int i = secondCount + 1; i < nums.length; i++) {
            if (i == nums.length - 1) {
                arr2.add(nums[i]);
            } else if (nums[i] <= nums[i + 1]) {
                arr2.add(nums[i]);
            } else {
                return false;
            }
        }

        List<Integer> finalArr = new ArrayList<>();
        finalArr.addAll(arr2);
        finalArr.addAll(arr1);

        for (int i = 0; i < finalArr.size() - 1; i++) {
            if (finalArr.get(i) <= finalArr.get(i + 1)) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }
}