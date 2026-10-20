class Solution {
    public boolean isPalindrome(String s, int l, int h) {
        while (l < h) {
            if (s.charAt(l) != s.charAt(h)) {
                return false;
            }
            l++;
            h--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int l = 0, h = s.length() - 1;
        while (l < h) {
            if (s.charAt(l) != s.charAt(h)) {
                return isPalindrome(s, l + 1, h) || isPalindrome(s, l, h - 1);
            }
            l++;
            h--;
        }
        return true;
    }
}