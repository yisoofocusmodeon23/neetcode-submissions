class MinStack {
    Stack<Long> st;
    long min;
    public MinStack() {
        st = new Stack<>();
    }

    public void push(int val) {
        if (st.isEmpty()) {
            st.push((long) val);
            min = val;
        } else if (val <= min) {
            // encoded = 2 * val - oldMin
            // oldMin = 2 * val - encoded
            st.push(2L * val - min);
            min = val;
        } else {
            st.push((long)val);
        }
    }

    public void pop() {
        long popped = st.pop();
        if (popped < min) {
            min = 2 * min - popped;
        }
    }

    public int top() {
        if (st.peek() < min) {
            return (int) min;
        } else {
            return st.peek().intValue();
        }
    }

    public int getMin() {
        return (int) min;
    }
}
