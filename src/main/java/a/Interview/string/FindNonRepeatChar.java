package a.Interview.string;

/**
 * Created by minchanglong on 2/1/17.
 *
 * If assuming non unicode characters in your input String, and Uppercase or Lowercase characters are assumed to be
 * different, the following would do it with o(n) and supports all ASCII codes from 0 to 255
 */
public class FindNonRepeatChar {
    public static void main(String[] args) {
        System.out.println(getFirstNotRepeatedChar("ababbccdcc"));
    }

    public static Character getFirstNotRepeatedChar(String input) {

        int[] flags = new int[256]; //all is initialized by 0
        /** byte[] flags = new byte[Character.MAX_VALUE + 1]; **/ //alternative

        for (int i = 0; i < input.length(); i++) { // O(n)
            flags[input.charAt(i)]++ ;
        }

        for (int i = 0; i < input.length(); i++) { // O(n)
            if(flags[input.charAt(i)] == 1)
                return input.charAt(i);
        }

        return null;
    }
}
