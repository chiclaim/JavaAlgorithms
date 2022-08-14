import com.chiclaim.algorithms.sort.insertion_sort.InsertionSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 *
 * @author chiclaim
 * <p></p>
 * created at 2011
 * <a href="https://github.com/chiclaim/">https://github.com/chiclaim/</a>
 */
public class SortTest {


    @Test
    void testSort() {
        int[] arr = new int[]{2, 0, 4, 1, 7, 9, 6};
        new InsertionSort().sort(arr);
        Assertions.assertArrayEquals(arr, new int[]{0, 1, 2, 4, 6, 7, 9});
    }

}
