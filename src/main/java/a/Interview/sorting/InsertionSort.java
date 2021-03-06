package a.Interview.sorting;

/**
 * Created by minchanglong on 1/19/17.
 */
public class InsertionSort {
    public static void main(String a[]){
        int[] arr1 = {10,34,2,56,7,67,88,42};
        int[] arr2 = doInsertionSort(arr1);
        for(int i:arr2){
            System.out.print(i);
            System.out.print(", ");
        }
        System.out.println();
        solution(arr1);
        for(int i:arr1){
            System.out.print(i);
            System.out.print(", ");
        }

    }

    static void solution(int[] input) {
        for (int i = 1; i < input.length - 1; i++) {
            for (int j = i; j > 0; j--) {
                if (input[j] < input[j-1]) {
                    int temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
    }

    public static int[] doInsertionSort(int[] input) {

        int temp;
        for (int i = 1; i < input.length; i++) {
            for (int j = i; j > 0; j--) {
                if (input[j] < input[j - 1]) {
                    temp = input[j];
                    input[j] = input[j - 1];
                    input[j - 1] = temp;
                }
            }
        }

        return input;
    }
}

