class Solution {
    public int findMinElementIdx(int[] nums) {
        int low = 0, high = nums.length - 1, mid;
        while (low < high) {
            mid = low + ((high - low) / 2);
            if (nums[mid] < nums[high]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public int binarySearch(int[] nums, int low, int high, int target) {
        int mid;
        while (low <= high) {
            mid = low + ((high - low) / 2);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        int minElIdx = findMinElementIdx(nums);
        int targetIdx = binarySearch(nums, 0, minElIdx - 1, target);
        if (targetIdx == -1) {
            targetIdx = binarySearch(nums, minElIdx, nums.length - 1, target);
        }
        return targetIdx;
    }
}
