package a.Interview.recursion;

/**
 * Created by minchanglong on 1/11/17.
 */
public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindromeIterative("ababa"));
        System.out.println(isPalindromeRecursive("ababa"));
        System.out.println(isPalindromeLoop("ababa".toCharArray(), 0, 4));
    }

    public static boolean isPalindromeLoop(char[] chars, int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            if (chars[startIndex] != chars[endIndex]) {
                return false;
            }
            startIndex++;
            endIndex--;
        }
        return true;
    }

    private static boolean isPalindromeIterative(String str) {
        StringBuffer sb = new StringBuffer();
        char[] chars = str.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            sb.append(chars[i]);
        }

        return sb.toString().equals(str);
    }

    private static boolean isPalindromeRecursive(String str) {
        return str.equals(reverse(str));
    }

    private static String reverse(String str) {
        if (str == null) {
            return null;
        }

        if (str.length() <= 1) {
            return str;
        }

        return reverse(str.substring(1)) + str.charAt(0);
    }
}

