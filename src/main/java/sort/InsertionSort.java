package sort;

/**
 * Key is to maintain sorting in the sorted portion of the array.
 *
 * Procedure: INSERTION-SORT(A)
 *
 * Inputs:
 * - A: an array to be sorted
 *
 * Output:
 * - A sorted in ascending order
 *
 * 1) for i = 1 to A.length - 1
 *      a) Set element to A[i] and set j to i - 1
 *      b) While j >= 0 and A[j] > element
 *          i) Set A[j + 1] to A[j]
 *          ii) Decrement j by 1
 *      c) Set A[j + 1] to element
 *
 *
 * Complexity: O(n^2)
 */
public class InsertionSort {

    public static <T extends Comparable<T>> T[] insertionSort(T[] array) {
        for (int start = 1; start < array.length; start++) {
            T element = array[start];
            for (int checkPosition = start - 1; checkPosition >= 0; checkPosition--) {
                T previous = array[checkPosition];
                if (element.compareTo(previous) < 0) {
                    array[checkPosition] = element;
                    array[checkPosition + 1] = previous;
                }
            }
        }

        return array;
    }

}
