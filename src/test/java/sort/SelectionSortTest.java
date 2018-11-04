package sort;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class SelectionSortTest {

    @Test
    public void testSelectionSort() {
        String[] array = createArray();
        String[] resultArray = SelectionSort.selectionSort(array);
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

    private String[] createArray() {
        String[] result = new String[1_000];
        Random random = new Random();
        for (int i = 0; i < 1_000; i++) {
            result[i] = "" + random.nextInt(100_000);
        }
        return result;
    }

}
