package a.Interview.string;

/**
 * Created by minchanglong on 2/1/17.
 */
public class MostCommonCharacters {

    public static void main(String[] args) {
        String test = "bcdddddaaaaa";
        System.out.println(getMax(test));
        System.out.println(getMaxInOrder(test));
    }

    /**
     * You have to do it in reverse order
     * In order to find the first character which is the most common
     * @param word
     * @return
     */
    public static char getMax(String word) {
        if (word == null || word.isEmpty()) {
            throw new IllegalArgumentException("input word must have non-empty value.");
        }
        char maxchar = ' ';
        int maxcnt = 0;
        /**
         * if you are confident that your input will be only ascii, then this array can be size 128.
         * Otherwise, you should do Character.MAX_VALUE which would is the size all unicode characters 65535
         */
        int[] charcnt = new int[Character.MAX_VALUE + 1];
        for (int i = word.length() - 1; i >= 0; i--) {
            char ch = word.charAt(i);
            // increment this character's cnt and compare it to our max.
            if (++charcnt[ch] >= maxcnt) {
                maxcnt = charcnt[ch];
                maxchar = ch;
            }
        }
        return maxchar;
    }

    /**
     * In order traverse of the string
     * @param word
     * @return
     */
    public static char getMaxInOrder(String word) {
        if (word == null || word.isEmpty()) {
            throw new IllegalArgumentException("input word must have non-empty value.");
        }
        char maxchar = ' ';
        int maxcnt = 0;
        // if you are confident that your input will be only ascii, then this array can be size 128.
        int[] charcnt = new int[Character.MAX_VALUE + 1];
        for (int i = 0; i <  word.length(); i++) {
            char ch = word.charAt(i);
            // increment this character's cnt and compare it to our max.
            if (++charcnt[ch] >= maxcnt) {
                maxcnt = charcnt[ch];
                maxchar = ch;
            }
        }
        return maxchar;
    }
}
