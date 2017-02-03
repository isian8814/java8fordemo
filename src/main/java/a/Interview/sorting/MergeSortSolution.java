package a.Interview.sorting;

/**
 * Created by minchanglong on 2/2/17.
 */
public class MergeSortSolution {

    public static void main(String[] args) {
        int[] inputArr = {45,23,11,89,77,98,4,28,65,43,11};
        mergeSort(inputArr, 0, inputArr.length - 1);

        for(int i:inputArr){
            System.out.print(i);
            System.out.print(" ");
        }
    }

    static void mergeSort(int[] arr, int start, int end) {
        if (start < end) { /** need a condition to get out**/
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            doMerges(arr, start, mid, end);
        }
    }

    static void doMerges(int[] arr, int start, int mid, int end) {
        int[] helper = new int[arr.length];
        /** copy arr to a helper array **/
        for (int i = start; i <= end; i++) {
            helper[i] = arr[i];
        }

        int firstHalfStart = start;
        int secHalfStart = mid + 1;
        int index = start;
        while (firstHalfStart <= mid && secHalfStart <= end) {
            if (helper[firstHalfStart] <= helper[secHalfStart]) {
                arr[index] = helper[firstHalfStart];
                firstHalfStart++;
            } else {
                arr[index] = helper[secHalfStart];
                secHalfStart++;
            }
            index++;
        }

        /** if firstHalfStart <= mid, then the second half has already in right place
         *  the left elements in the firstHalf would be in largest portion
         *  since firstHalf and Second half are all sorted, there is no need to sort the left elements in first half
         * **/
        while (firstHalfStart <= mid) {
            arr[index] = helper[firstHalfStart];
            index++;
            firstHalfStart++;
        }
    }
}
