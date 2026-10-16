class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int points = 0;
        for (int i = 0; i < operations.length; i++) {
            String op = operations[i];
            if (op.equals("+")) {
                int prev = st.pop();
                int prev2 = st.peek();
                st.push(prev);
                int score = prev + prev2;
                points += (prev + prev2);
                st.push(score);
            } else if (op.equals("D")) {
                int doubleScore = 2 * st.peek();
                points += doubleScore;
                st.push(doubleScore);
            } else if (op.equals("C")) {
                points -= st.pop();
            } else {
                int num = Integer.parseInt(op);
                st.push(num);
                points += num;
            }
        }
        return points;
    }
}