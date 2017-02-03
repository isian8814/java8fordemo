package a.Interview.Integer;

/**
 * Created by minchanglong on 1/26/17.
 */
public class RevertInteger {

    public static void main(String[] args) {
        int n = 678;
        int n1 = -678;
        System.out.println(solution(n));
        System.out.println(solution(n1));
    }

    private static int solution(int n) {
        int revertedNumber = 0;

        while (n != 0) {
            revertedNumber = revertedNumber * 10 +  n % 10;
            n = n / 10;
        }

        return revertedNumber;
    }

    public int reverse(int x) {
        int rev = 0;
        while(x != 0){
            rev = rev*10 + x%10;
            x = x/10;
        }

        return rev;
    }
}
