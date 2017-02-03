package a.Interview.stackandqueue;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by minchanglong on 2/1/17.
 */
public class ValidateParenthesis {
    public static boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);

            if (map.keySet().contains(curr)) {
                stack.push(curr);
            } else if (map.values().contains(curr)) {
                if (!stack.empty() && map.get(stack.peek()) == curr) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.empty();
    }

    public static boolean solution(String s) {
        HashMap<String, String> parenthesis = new HashMap<>();
        parenthesis.put("{", "}");
        parenthesis.put("[", "]");
        parenthesis.put("(", ")");

        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            String sub = s.substring(i, i + 1);
            if (parenthesis.keySet().contains(sub)) {
                stack.push(sub);
            } else if (parenthesis.values().contains(sub)) {
                if (!stack.isEmpty() && parenthesis.get(stack.peek()).equals(sub)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
