class Solution {
    public int getSum(int a, int b) {
        int sum = a ^ b;
        int carry = (a & b) << 1;
        while (carry != 0) {
            int newSum = sum ^ carry;
            int newCarry = sum & carry;
            newCarry <<= 1;
            sum = newSum;
            carry = newCarry;
        }
        return sum;
    }
}
