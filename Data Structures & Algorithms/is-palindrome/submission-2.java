class Solution {
    public boolean isAlphanumeric(char ch) {
        return (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9');
    }

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int low = 0, high = s.length() - 1;
        while (low < high) {
            char left = s.charAt(low);
            char right = s.charAt(high);
            if (isAlphanumeric(left) && isAlphanumeric(right)) {
                if (left != right) {
                    return false;
                }
                low++;
                high--;
            } else if (!isAlphanumeric(left)) {
                low++;
            } else {
                high--;
            }
        }
        return true;
    }
}
