package search.linear;

/**
 * Binary Search is one of the fasted algorithms for searching data.
 * It works by splitting the data in half and testing the midpoint against
 * the value. Based on if the midpoint is bigger or smaller than the value,
 * half of the data is chosen and the same search is done again. Keep chopping
 * it in half until it is done.
 *
 * IMPORTANT: the data has to be sorted for this to work.
 *
 * STEPS:
 *
 * 1) p = 0, r = (array.length - 1)
 * 2) while p <= r, do stuff
 *      a) Find midpoint of range, set q = (p + r) / 2
 *      b) Check if array[q] == value
 *      c) If equal, return q
 *      d) If array[q] > value, r = q - 1
 *      e) If array[q] < value, p = q + 1
 * 3) If after everything it can't find the value, return -1
 */
public class BinarySearch {

    /**
     * Performs a binary search on the data. Cannot handle null values.
     *
     * @param array the array to search.
     * @param value the value to search for.
     * @param <T> the type of the value.
     * @return the index of the value, or -1 if it can't be found.
     */
    public static <T extends Comparable<T>> int binarySearch(T[] array, T value) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int midpoint = (start + end) / 2;
            int comparison = array[midpoint].compareTo(value);
            if (comparison > 0) {
                end = midpoint - 1;
            }
            else if (comparison < 0) {
                start = midpoint + 1;
            }
            else {
                return midpoint;
            }
        }

        return -1;
    }

}
