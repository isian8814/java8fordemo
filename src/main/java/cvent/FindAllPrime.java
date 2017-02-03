package cvent;

/**
 * Created by minchanglong on 1/11/17.
 */
public class FindAllPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(1));
    }

    private static boolean isPrime(int n) {
        if (n%2==0) return false; //check if n is a multiple of 2

        for (int i = 3; i*i <= n; i += 2) { //if not dived by 2, then just check odds
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean solution(int n) {
        if (n % 2 == 0)
            return false;

        for (int i = 3; i < n; i = i +2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
