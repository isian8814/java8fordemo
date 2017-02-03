package a.Interview.string;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by minchanglong on 1/19/17.
 */
public class Permutation {
    public static void main(String[] args) {
        System.out.println(("abc").substring(3).equals(""));
        System.out.println(permutationFinder("abc").toString());
        System.out.println(permutation("abc").toString());
    }

    public static Set<String> permutationFinder(String str) {
        Set<String> perm = new HashSet<String>();
        //Handling error scenarios
        if (str == null) {
            return null;
        } else if (str.length() == 0) {
            perm.add("");
            return perm;
        }
        char initial = str.charAt(0); // first character
        String rem = str.substring(1); // Full string without first character
        Set<String> words = permutationFinder(rem);
        for (String strNew : words) {
            for (int i = 0;i<=strNew.length();i++){
                perm.add(charInsert(strNew, initial, i));
            }
        }
        return perm;
    }

    public static String charInsert(String str, char c, int j) {
        String begin = str.substring(0, j);
        String end = str.substring(j);
//        System.out.println(j);
//        System.out.println(str);
//        System.out.println(begin + " " + end);
        return begin + c + end;
    }

    static Set<String> permutation(String str) {
        Set<String> perm = new HashSet<>();

        if (str == null) {
            return null;
        } else if (str.equals("")) {
            perm.add("");
            return perm;
        }

        char initial = str.charAt(0);
        String restStr = str.substring(1);
        Set<String> words = permutation(restStr);

        for (String strNew : words) {
            for (int i = 0; i <= strNew.length(); i++) {
                perm.add(charInsertSolution(strNew, initial, i));
            }
        }

        return perm;
    }

    static String charInsertSolution(String str, char initial, int i) {
        String begin = str.substring(0, i);
        String end = str.substring(i);

        return begin + initial + end;
    }
}
