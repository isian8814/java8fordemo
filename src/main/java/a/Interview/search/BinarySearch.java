package a.Interview.search;

/**
 * Created by minchanglong on 1/19/17.
 */
public class BinarySearch {
    private int binarySearchIterative(int[] inputArr, int key) {
        int start = 0;
        int end = inputArr.length - 1;
        while (start <= end) {  /** Notice that start will equal to end sometime **/
            int mid = (start + end) / 2;
            if (key == inputArr[mid]) {
                return mid;
            }
            if (key < inputArr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    private int solutionIterative(int[] inputArr, int key) {
        int start = 0;
        int end = inputArr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (inputArr[mid] > key) {
                end = mid - 1;
            } else if (inputArr[mid] < key) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    private int binarySearchRecursive(int[] a, int key, int low, int high) {
        if (low > high) return -1;

        int mid = (low + high) / 2;
        if (a[mid] < key) {
            return binarySearchRecursive(a, key, mid + 1, high);
        } else if (a[mid] > key) {
            return binarySearchRecursive(a, key, low, mid - 1);
        } else {
            return mid;
        }
    }

    public static void main(String[] args) {

        BinarySearch mbs = new BinarySearch();
        int[] arr = {2, 4, 6, 8, 12, 14, 16};
        System.out.println("Key 14's position: " + mbs.binarySearchIterative(arr, 14));
        System.out.println("Key 14's position: " + mbs.solutionIterative(arr, 14));
        int[] arr1 = {6, 34, 78, 123, 432, 900};
        System.out.println("Key 432's position: " + mbs.binarySearchIterative(arr1, 432));
        System.out.println("Key 14's position: " + mbs.solutionIterative(arr1, 432));
    }
}
