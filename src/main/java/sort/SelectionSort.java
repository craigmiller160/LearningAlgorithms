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
 * Complexity: O(n^2)
 *
 */
public class SelectionSort {

    public static <T extends Comparable<T>> T[] selectionSort(T[] array) {
        for (int start = 0; start < array.length; start++) {
            T startValue = array[start];
            int minimumIndex = start;
            T minimumValue = startValue;
            for (int position = start; position < array.length; position++) {
                T value = array[position];
                if (value.compareTo(minimumValue) < 0) {
                    minimumIndex = position;
                    minimumValue = value;
                }
            }

            array[start] = minimumValue;
            array[minimumIndex] = startValue;
        }

        return array;
    }

}
