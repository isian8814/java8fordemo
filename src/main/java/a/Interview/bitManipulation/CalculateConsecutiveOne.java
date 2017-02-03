package a.Interview.bitManipulation;

/**
 * Created by minchanglong on 1/21/17.
 * given a int number, count how many consecutive one when converting to a binary
 */
public class CalculateConsecutiveOne {

    public static void main(String[] args) {
        int n = 115; //1110011
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int maxCount = Integer.MIN_VALUE;

        int count = 0;
        while (n != 0) {

            if ((n & 1) == 1) {
                count++;
            } else {
                if (maxCount < count) {
                    maxCount = count;
                }
                count = 0;
            }

            n = n >> 1;
        }

        return maxCount > count ? maxCount : count; /** if the last digit is one, then the count would be the max **/
    }

    public static int countConsecutiveOne(int n) {
        int maxCount = 0;
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                }
                count = 0;
            }
            n >>= 1;
        }

        return maxCount > count ? maxCount : count;
    }
}
