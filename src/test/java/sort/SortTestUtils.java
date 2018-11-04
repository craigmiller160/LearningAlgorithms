package sort;

import java.util.Random;

public class SortTestUtils {

    public static String[] createArray() {
        String[] result = new String[1_000];
        Random random = new Random();
        for (int i = 0; i < 1_000; i++) {
            result[i] = "" + random.nextInt(100_000);
        }
        return result;
    }

}
