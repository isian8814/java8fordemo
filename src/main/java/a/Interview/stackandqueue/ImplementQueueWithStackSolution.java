package a.Interview.stackandqueue;

import java.util.Stack;

/**
 * Created by minchanglong on 2/2/17.
 */
public class ImplementQueueWithStackSolution {

    Stack<Integer> temp = new Stack<>();
    Stack<Integer> value = new Stack<>();

    public void offer(int data) {
        if (value.isEmpty()) {
            value.push(data);
        } else {
            while (!value.isEmpty()) {
                temp.push(value.pop());
            }

            value.push(data);

            while (!temp.isEmpty()) {
                value.push(temp.pop());
            }
        }
    }

    public Integer poll() {
        return value.pop();
    }

    public Integer peek() {
        return value.peek();
    }

    public boolean isEmpty() {
        return value.isEmpty();
    }
}
