package search;

import org.junit.Assert;
import org.junit.Test;
import search.LinearSearch;

public class LinearSearchTest {

    @Test
    public void testFindString() {
        String[] array = {"One", "Two", "Three", "Four"};
        int result = LinearSearch.linearSearch(array, "Three");
        Assert.assertEquals(2, result);
    }

    @Test
    public void testStringNotFound() {
        String[] array = {"One", "Two", "Three", "Four"};
        int result = LinearSearch.linearSearch(array, "Foo");
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testFindNull() {
        String[] array = {"One", null, "Three", "Four"};
        int result = LinearSearch.linearSearch(array, null);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testNullNotFound() {
        String[] array = {"One", "Two", "Three", "Four"};
        int result = LinearSearch.linearSearch(array, null);
        Assert.assertEquals(-1, result);
    }

}
