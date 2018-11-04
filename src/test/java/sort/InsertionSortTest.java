package sort;

import org.junit.Assert;
import org.junit.Test;

public class InsertionSortTest {

    @Test
    public void testInsertionSort() {
        String[] array = SortTestUtils.createArray();
        String[] resultArray = InsertionSort.insertionSort(array);
        Assert.assertNotNull(resultArray);
        Assert.assertEquals(array.length, resultArray.length);

        String previous = null;
        for (int i = 0; i < array.length; i++) {
            String elem = resultArray[i];
            if (previous != null) {
                Assert.assertTrue("Array element is not larger than the previous element. Index: " + i + " Previous: " + previous + " Elem: " + elem, elem.compareTo(previous) >= 0);
            }
            previous = elem;
        }
    }

}
