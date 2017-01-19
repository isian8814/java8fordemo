package a.Interview.string;

/**
 * Created by minchanglong on 1/19/17.
 */
public class StringCharOperations {
    public static String getDistinct(String s) {
        boolean[] hasChar = new boolean[128];
        for (int i = 0; i < s.length(); i++) {
            char charToDelete = s.charAt(i);
            if (!hasChar[charToDelete]) {
                hasChar[charToDelete] = true;
            } else {
                s = s.substring(0, i) + s.substring(i + 1, s.length());
                i = i - 1;
            }
        }
        return s;
    }

    public static String deleteCharInStr(String s, char charToDelete) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == charToDelete) {
                s = s.substring(0, i) + s.substring(i + 1, s.length());
                i = i - 1;
            }
        }

        return s;
    }

    public static boolean hasTwoDinstinctChars(String s) {
        boolean[] checkChar = new boolean[128];
        for (int i = 0; i < s.length(); i++) {
            if (!checkChar[s.charAt(i)]) {
                checkChar[s.charAt(i)] = true;
            } else {
                s = s.substring(0, i) + s.substring(i + 1, s.length());
                i = i - 1;
            }
        }

        return s.length() == 2;
    }

    public static boolean hasTwoAdjacentChars(String s) {
        boolean hasTwoAdjacent = false;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                hasTwoAdjacent = true;
            }
        }

        return hasTwoAdjacent;
    }

    public static boolean hasCommonChars(String s1, String s2) {
        boolean hasCommon = false;
        for (int i = 0; i < 128; i++) {
            if (s1.indexOf(i) > -1 && s2.indexOf(i) > -1) {
                hasCommon = true;
                break;
            }
        }

        return hasCommon;
    }
}
