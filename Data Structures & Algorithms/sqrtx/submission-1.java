class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        int low = 2, high = x, mid;
        while (low <= high) {
            mid = low + ((high - low) / 2);
            long squared = (long) mid * mid; 
            if(squared == x){
                return mid;
            } else if(squared < x){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }
}