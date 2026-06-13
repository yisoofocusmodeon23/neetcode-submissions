class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = 1;
        // store the prefix product
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }
        // store the product of prefix product amd suffix product
        int suffix = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            suffix *= nums[i + 1]; // calculating suffix product for each element
            result[i] *= suffix; // prefix * suffix for each element
        }
        return result;
    }
}
