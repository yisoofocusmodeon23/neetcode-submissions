class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1; // insertion idx
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k++] = nums[i];
            }
        }
        return k; // unique elements
    }
}