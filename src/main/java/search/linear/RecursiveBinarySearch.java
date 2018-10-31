package search.linear;

import java.util.Arrays;

public class RecursiveBinarySearch {

    //TODO never actually finished this one
    public static <T extends Comparable<T>> int recursiveBinarySearch(T[] array, int position, T value) {
        if (position >= array.length || position < 0) {
            return -1;
        }

        int comparison = array[position].compareTo(value);
        if (comparison > 0) {
            int start = 0;
            int end = position - 1;
            int midpoint = (start + end) / 2;
            return recursiveBinarySearch(Arrays.copyOfRange(array, start, end), midpoint, value);
        }
        else if (comparison < 0) {
            int start = position + 1;
            int end = array.length - 1;
            int midpoint = (start + end) / 2;
            return recursiveBinarySearch(Arrays.copyOfRange(array, start, end), midpoint, value);
        }
        else {
            return position;
        }
    }

}
