package a.Interview.sorting;

import java.util.Arrays;

/**
 * Created by minchanglong on 1/19/17.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int crunchifyArry[] = { 15, 3, 9, 7, 19, 8, 1, 5 };
        log("Let's get started on Bubble Sort implementation in Java \n");
        log("============ Ascending Order result:" + Arrays.toString(CrunchifyBubbleSortAsceMethod(crunchifyArry)) + "\n");
        log("============ Descending Order result:" + Arrays.toString(CrunchifyBubbleSortDescMethod(crunchifyArry)) + "\n");
    }

    // Bubble Sort Algorithm in Ascending Order
    public static int[] CrunchifyBubbleSortAsceMethod(int[] crunchifyArr) {
        int temp;
        for (int i = 0; i < crunchifyArr.length - 1; i++) {

            for (int j = 1; j < crunchifyArr.length - i; j++) {
                if (crunchifyArr[j - 1] > crunchifyArr[j]) {
                    temp = crunchifyArr[j - 1];
                    crunchifyArr[j - 1] = crunchifyArr[j];
                    crunchifyArr[j] = temp;
                }
            }
            log("Iteration " + (i + 1) + ": " + Arrays.toString(crunchifyArr));
        }
        return crunchifyArr;
    }

    // Bubble Sort Algorithm in Descending Order
    public static int[] CrunchifyBubbleSortDescMethod(int[] crunchifyArr) {
        int temp;
        for (int i = 0; i < crunchifyArr.length - 1; i++) {

            for (int j = 1; j < crunchifyArr.length - i; j++) {
                if (crunchifyArr[j - 1] < crunchifyArr[j]) {
                    temp = crunchifyArr[j - 1];
                    crunchifyArr[j - 1] = crunchifyArr[j];
                    crunchifyArr[j] = temp;
                }
            }
            log("Iteration " + (i + 1) + ": " + Arrays.toString(crunchifyArr));
        }
        return crunchifyArr;
    }

    // Simple log util
    private static void log(String result) {
        System.out.println(result);

    }
}
