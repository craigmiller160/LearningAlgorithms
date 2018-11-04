package sort;

import org.junit.Assert;
import org.junit.Test;

public class InsertionSortTest {

    @Test
    public void testInsertionSort() {
        Integer[] array = {17, 4, 86, 43, 32, 68, 54, 73};
        Integer[] sortedArray = {4, 17, 32, 43, 54, 68, 73, 86};
        Integer[] resultArray = InsertionSort.insertionSort(array);
        Assert.assertNotNull(resultArray);
        Assert.assertEquals(array.length, resultArray.length);
        Assert.assertEquals(sortedArray, resultArray);
    }

}
