/**
 * Main class of the Java program.
 */

public class Main {

    public static void main(String[] args) {
        //swapDemo();
        getCharIntTable();
    }

    /**
     * characters
     */

    public static void getCharIntTable() {
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        String str = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(str.length());
        System.out.println(table.length);
    }

    /**
     * swap demo
     */
    public static void swapDemo() {

        SwapDemo t1 = new SwapDemo(1, 2);
        SwapDemo t2 = new SwapDemo(2, 3);

        //SwapDemo temp = t1;
        //t1 = t2;
        //t2 = temp;

        swap(t1, t2);

        System.out.println("T1 : " + t1);
        System.out.println("T2 : " + t2);

        System.out.println(demo());

        int[] arr = {1,2};
        swap(arr, 0, 1);
        System.out.println(arr[0] + " " + arr[1]);
    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    static void swap(SwapDemo a, SwapDemo b) {
        SwapDemo temp;
        temp = b;
        b = a;
        a = temp;
    }

    static String demo() {
        try {
            int a = 3 / 0;
            System.out.println("A");
            return "A";
        } catch (Exception e) {
            System.out.println("B");
            return "B";
        } finally {
            System.out.println("C");
            return "C";
        }
    }
}

class SwapDemo {
    public int x;
    public int y;

    SwapDemo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return String.valueOf(x) + " " + String.valueOf(y);
    }
}