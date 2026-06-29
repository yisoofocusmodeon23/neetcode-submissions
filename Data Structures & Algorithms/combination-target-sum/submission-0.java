class Solution {
    public void findCombos(
        int[] nums, int target, List<List<Integer>> result, List<Integer> combo, int idx) {
        if (target == 0) {
            result.add(new ArrayList(combo));
            return;
        }
        if (idx == nums.length || target < 0) {
            return;
        }
        int num = nums[idx];
        // choose num
        combo.add(num); // choose
        findCombos(nums, target - num, result, combo, idx); // recurse
        // don't choose num
        combo.remove(combo.size() - 1); // remove
        findCombos(nums, target, result, combo, idx + 1);
    }

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> combo = new ArrayList<>();
        findCombos(nums, target, result, combo, 0);
        return result;
    }
}
