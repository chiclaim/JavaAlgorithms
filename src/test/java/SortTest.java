import com.chiclaim.algorithms.sort.insertion_sort.DirectionInsertionSort;
import com.chiclaim.algorithms.sort.insertion_sort.ShellSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author chiclaim
 * <p>
 * created at 2022
 * <a href="https://github.com/chiclaim/">https://github.com/chiclaim/</a>
 */
public class SortTest {


    @Test
    void testDirectionInsertionSort() {
        int[] arr = new int[]{2, 0, 4, 1, 7, 3, 6};
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr2);
        new DirectionInsertionSort().sort(arr);
        Assertions.assertArrayEquals(arr, arr2);
    }

    @Test
    void testShellSortA() {
        int[] arr = new int[]{2, 3, 6, 1, 8, 7, 4, 9, 0, 5};
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr2);
        new ShellSort().sort(arr);
        Assertions.assertArrayEquals(arr, arr2);
    }

}
