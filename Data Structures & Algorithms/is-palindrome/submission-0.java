class Solution {
    public boolean isPalindrome(String s) {
        int low = 0, high = s.length() - 1;
        while (low < high) {
            if (Character.isLetterOrDigit(s.charAt(low))
                && Character.isLetterOrDigit(s.charAt(high))) {
                if (s.toLowerCase().charAt(low) != s.toLowerCase().charAt(high)) {
                    return false;
                }
                low++;
                high--;
            } else if (!Character.isLetterOrDigit(s.charAt(low))) {
                low++;
            } else if (!Character.isLetterOrDigit(s.charAt(high))) {
                high--;
            }
        }
        return true;
    }
}
