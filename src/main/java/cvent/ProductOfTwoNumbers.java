package cvent;

/**
 * Created by minchanglong on 1/11/17.
 */
public class ProductOfTwoNumbers {

    public static void main(String[] args) {
        System.out.println(product(1, 5));
    }

    private static int product(int x, int y) {

        if (x >= y) {
            return y;
        }

        return x * product(x + 1, y);

    }
}
