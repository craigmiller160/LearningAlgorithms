package search.linear;

/**
 * Procedure: Recursive Linear Search (A,i,x)
 *
 * Inputs: Same as linearSearch, but with added parameter i for index.
 * Outputs: The index of an element matching x in the subarray from A[i].
 *          through A[n] or -1 if x is not found in the array.
 *
 * 1) If i > n, then return -1
 * 2) Else if A[i] == x, then return i
 * 3) Else return Recursive Linear Search (A, i + 1, x)
 */
public class RecursiveLinearSearch {

    public static <T> int recursiveLinearSearch(T[] array, int position, T value) {
        if (position >= array.length) {
            return -1;
        }
        else if (array[position].equals(value)) {
            return position;
        }
        else {
            return recursiveLinearSearch(array, position + 1, value);
        }
    }

}
