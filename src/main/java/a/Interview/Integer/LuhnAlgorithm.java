package a.Interview.Integer;

/**
 * Created by minchanglong on 2/1/17.
 * https://en.wikipedia.org/wiki/Luhn_algorithm
 *
 * if you want to get the check digit, get the last digit of the sum with subtraction of 10;
 * Eg. 7992739871 => sum = 67 => check digit = 10 - 7 = 3 => 79927398713
 */
public class LuhnAlgorithm {

    public static void main(String[] args) {
        System.out.println(solution("79927398710"));
        System.out.println(solution("79927398713"));
        System.out.println(getCheckDigit("7992739871"));
    }

    private static boolean solution(String ccNumber) {
        boolean alternative = false;

        int sum = 0;
        for (int i = 0; i < ccNumber.length(); i++) {

            if (!alternative) {
                sum = sum + Integer.parseInt(ccNumber.substring(i, i + 1));
            } else {
                int doubleDigit = Integer.parseInt(ccNumber.substring(i, i + 1)) * 2;
                sum = sum + doubleDigit / 10 + doubleDigit % 10;
            }

            alternative = !alternative;
        }

        return (sum % 10) == 0;
    }

    private static String getCheckDigit(String ccNumber) {
        boolean alternative = false;

        int sum = 0;
        for (int i = 0; i < ccNumber.length(); i++) {

            if (!alternative) {
                sum = sum + Integer.parseInt(ccNumber.substring(i, i + 1));
            } else {
                int doubleDigit = Integer.parseInt(ccNumber.substring(i, i + 1)) * 2;
                sum = sum + doubleDigit / 10 + doubleDigit % 10;
            }

            alternative = !alternative;
        }

        return String.valueOf(10 - sum % 10);
    }

    private static boolean check(String ccNumber) {
        int sum = 0;
        boolean alternate = false;
        for (int i = ccNumber.length() - 1; i >= 0; i--)
        {
            int n = Integer.parseInt(ccNumber.substring(i, i + 1));
            if (alternate)
            {
                n *= 2;
                if (n > 9) {
                    n = (n % 10) + 1;
                }
            }
            sum += n;
            alternate = !alternate;
        }
        return (sum % 10 == 0);
    }
}
