package search;

import org.junit.Assert;
import org.junit.Test;
import search.BinarySearch;

public class BinarySearchTest {

    @Test
    public void testFindValue() {
        String[] array = createArray();

        int result = BinarySearch.binarySearch(array, "36");
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

        int result = BinarySearch.binarySearch(array, "abc");
        Assert.assertEquals(-1, result);
    }

}
