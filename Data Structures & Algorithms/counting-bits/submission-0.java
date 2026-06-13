class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            int j = i;
            int count = 0;
            while (j > 0) {
                j = j & (j - 1);
                count++;
            }
            ans[i] = count;
        }
        return ans;
    }
}
