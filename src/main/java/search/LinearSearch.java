package search;

/**
 * Procedure: Linear-Search (a,x)
 *
 * Inputs:
 * - a: the array to search in
 * - x: the value we are searching for
 *
 * Outputs:
 * - The index position where a[i] == x or -1 if not found
 *
 * 1) Set answer to -1
 * 2) For each index i going from 1 to n, in order
 * - If a[i] == x then set answer to the value of i
 * 3) Return the value of answer as the output
 */
public class LinearSearch {

    /**
     * Perform a linear search. Has a maximum performance of O(n).
     * It will find only the first match.
     *
     * @param array the array to search.
     * @param value the value to search for.
     * @param <T> the type of the array.
     * @return the index of the value, or -1 if not found.
     */
    public static <T> int linearSearch(T[] array, T value) {
        for (int i = 0; i < array.length; i++) {
            T elem = array[i];
            if (elem == null && value == null) {
                return i;
            }
            else if (elem != null && elem.equals(value)) {
                return i;
            }
        }

        return -1;
    }

}
