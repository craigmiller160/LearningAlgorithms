package search;

import org.junit.Assert;
import org.junit.Test;
import search.RecursiveBinarySearch;

public class RecursiveBinarySearchTest {

    @Test
    public void testFindValue() {
        String[] array = createArray();

        int result = RecursiveBinarySearch.recursiveBinarySearch(array, 0, "36");
        Assert.assertEquals(36, result);
    }

    private String[] createArray() {
        String[] array = new String[100];
        for (int i = 0; i < 100; i++) {
            array[i] = "" + i;
        }
        return array;
    }

    @Test
    public void testValueNotFound() {
        String[] array = createArray();

        int result = RecursiveBinarySearch.recursiveBinarySearch(array, 0, "abc");
        Assert.assertEquals(-1, result);
    }

}
