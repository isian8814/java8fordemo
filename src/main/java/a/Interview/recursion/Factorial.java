package a.Interview.recursion;

/**
 * Created by minchanglong on 1/19/17.
 */
public class Factorial {
    public static void main(String[] args) {
        int n = 7;
        int result = factorialRecursion(n);
        int result1 = factorialLoop(n);
        System.out.println("The factorialRecursion of 7 is " + result);
    }

    public static int factorialRecursion(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorialRecursion(n - 1);
        }
    }

    public static int factorialLoop(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}
