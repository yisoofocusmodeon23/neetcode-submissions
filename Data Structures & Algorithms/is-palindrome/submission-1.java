class Solution {
    public boolean isAlphanumeric(char ch) {
        if (ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9') {
            return true;
        }
        return false;
    }

    public boolean isPalindrome(String s) {
        int low = 0, high = s.length() - 1;
        while (low < high) {
            char left = s.toLowerCase().charAt(low);
            char right = s.toLowerCase().charAt(high);
            if (isAlphanumeric(left) && isAlphanumeric(right)) {
                if(left != right){
                    return false;
                }
                low++;
                high--;
            } else if(!isAlphanumeric(left)){
                low++;
            } else {
                high--;
            }
        }
        return true;
    }
}
