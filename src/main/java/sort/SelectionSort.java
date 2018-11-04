package sort;

/**
 * Procedure SLEECTION-SORT (A):
 *
 * Inputs:
 * - A: an array to be sored.
 *
 * Output:
 * - A sorted in ascending order.
 *
 * 1) For i = 0 to A.length - 1 (inclusive)
 *      a) Set minimum to i
 *      b) For j = i + 1 to A.length:
 *          i) If A[j] < A[minimum]
 *              1. Set minimum to j
 *      c) Swap A[i] with A[minimum].
 * 2) Repeat until we've been through every position in the array.
 *
 */
public class SelectionSort {

    public static <T extends Comparable<T>> T[] selectionSort(T[] array) {
        int start = 0;
        while (start < array.length) {
            T startValue = array[start];
            int minimumIndex = start;
            T minimumValue = startValue;

            for (int i = start; i < array.length; i++) {
                T value = array[i];
                if (value.compareTo(minimumValue) < 0) {
                    minimumIndex = i;
                    minimumValue = value;
                }
            }

            array[start] = minimumValue;
            array[minimumIndex] = startValue;

            start++;
        }

        return array;
    }

}
