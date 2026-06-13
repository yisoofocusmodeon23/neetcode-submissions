class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = (n * (n + 1)) / 2, numsSum = 0;
        for (int num : nums) {
            numsSum += num;
        }
        return totalSum - numsSum;
    }
}
