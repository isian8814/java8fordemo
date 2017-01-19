package a.Interview.string;

/**
 * Created by minchanglong on 1/19/17.
 */
public class LongestSubStr {
    public static int longestSubstr(String first, String second) {
        int maxLen = 0;
        int fl = first.length();
        int sl = second.length();
        int[][] table = new int[fl+1][sl+1];

        for (int i = 1; i <= fl; i++) {
            for (int j = 1; j <= sl; j++) {
                if (first.charAt(i-1) == second.charAt(j-1)) {
                    table[i][j] = table[i - 1][j - 1] + 1;
                    if (table[i][j] > maxLen)
                        maxLen = table[i][j];
                }
            }
        }
        return maxLen;
    }
}
