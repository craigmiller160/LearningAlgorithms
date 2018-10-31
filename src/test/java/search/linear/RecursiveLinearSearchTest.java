package search.linear;

import org.junit.Assert;
import org.junit.Test;

public class RecursiveLinearSearchTest {

    @Test
    public void testFindString() {
        String[] array = {"One", "Two", "Three", "Four"};
        int result = RecursiveLinearSearch.recursiveLinearSearch(array, 0, "Three");
        Assert.assertEquals(2, result);
    }

    @Test
    public void testStringNotFound() {
        String[] array = {"One", "Two", "Three", "Four"};
        int result = RecursiveLinearSearch.recursiveLinearSearch(array, 0, "Foo");
        Assert.assertEquals(-1, result);
    }

}
