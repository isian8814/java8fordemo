package a.Interview.string;

import a.Interview.recursion.Palindrome;

/**
 * Created by minchanglong on 1/19/17.
 */
public class FormPalindrome {

    public static void main(String[] args) {
        char[] input = "JAVA".toCharArray();
        System.out.println(findMinInsertToFormPalindrome(input, input.length));
    }

    private static int findMinInsertToFormPalindrome(char[] str, int n) {
        for (int i = n - 1; i >= 0; i--) {
            if (Palindrome.isPalindromeLoop(str, 0, i)) {
                return (n - i - 1);
            }
        }

        return n;
    }
}
