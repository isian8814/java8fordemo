package a.Interview.sorting;

import java.util.Arrays;

/**
 * Created by minchanglong on 2/2/17.
 */
public class QuickSortSolution {
    public static void main(String[] args) {
        int[] x = { 9, 2, 4, 7, 3, 7, 10 };

        quickSort(x, 0, x.length - 1);

        System.out.println(Arrays.toString(x));
    }

    static void quickSort(int[] arr, int start, int end) {
        int index = partition(arr, start, end);

        System.out.println(start + " " + index + " " + end);
        System.out.println(Arrays.toString(arr));

        if (start < index - 1) {
            quickSort(arr, start, index - 1);
        }

        if (index < end) {
            quickSort(arr, index, end);
        }
    }

    static int partition(int[] arr, int start, int end) {
        int pivot = arr[(start + end) / 2];
        System.out.println(pivot);

        while (start <= end) {
            while(arr[start] < pivot) start++;
            while(arr[end] > pivot) end--;

            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                /**
                 * need to move the pointers
                 */
                start++;
                end--;
            }
        }

        return start;
    }

}
