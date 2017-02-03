package a.Interview.stackandqueue;

import java.util.Stack;

/**
 * Created by minchanglong on 1/30/17.
 */
public class StackWIthMin extends Stack<Integer> {
    Stack<Integer> s2;

    public StackWIthMin() {
        s2 = new Stack<>();
    }

    public void push(int value) {
        if (value <= min()) {
            s2.push(value);
        }
        super.push(value);
    }

    public Integer pop() {
        int value = super.pop();
        if (value == min()) {
            s2.pop();
        }
        return value;
    }

    public int min() {
        if (s2.isEmpty()) {
            return Integer.MAX_VALUE;
        } else {
            return s2.peek();
        }
    }
}
