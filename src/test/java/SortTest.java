import com.chiclaim.algorithms.sort.insertion_sort.DirectionInsertionSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author chiclaim
 * <p></p>
 * created at 2011
 * <a href="https://github.com/chiclaim/">https://github.com/chiclaim/</a>
 */
public class SortTest {


    @Test
    void testDirectionInsertionSort() {
        int[] arr = new int[]{2, 0, 4, 1, 7, 3, 6};
        new DirectionInsertionSort().sort(arr);
        Assertions.assertArrayEquals(arr, new int[]{0, 1, 2, 3, 4, 6, 7});
    }

}
