package a.Interview.bitManipulation;

/**
 * Created by minchanglong on 1/21/17.
 */
public class CalculateConsecutiveOne {

    public int countConsecutiveOne(int n) {
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
