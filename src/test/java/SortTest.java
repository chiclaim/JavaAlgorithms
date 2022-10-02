import com.chiclaim.algorithms.sort.exchange_sort.BubbleSort;
import com.chiclaim.algorithms.sort.exchange_sort.QuickSort;
import com.chiclaim.algorithms.sort.insertion_sort.DirectionInsertionSort;
import com.chiclaim.algorithms.sort.insertion_sort.ShellSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

/**
 * @author chiclaim
 * <p>
 * created at 2022
 * <a href="https://github.com/chiclaim/">https://github.com/chiclaim/</a>
 */
public class SortTest {

    private int[] createIntArray(int size) {
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(size + 2 * size);
        }
        return arr;
    }

    @Test
    void testDirectionInsertionSort() {
        int[] arr = createIntArray(20);
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr2);
        new DirectionInsertionSort().sort(arr);
        Assertions.assertArrayEquals(arr, arr2);
    }

    @Test
    void testShellSortA() {
        int[] arr = createIntArray(20);
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr2);
        new ShellSort().sort(arr);
        Assertions.assertArrayEquals(arr, arr2);
    }

    @Test
    void testBubbleSort() {
        int[] arr = createIntArray(20);
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr2);
        new BubbleSort().sort(arr);
        System.out.println(Arrays.toString(arr));
        Assertions.assertArrayEquals(arr, arr2);
    }


    @Test
    void testQuickSort() {
        int[] arr = createIntArray(20);
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr2);
        new QuickSort().sort(arr);
        System.out.println(Arrays.toString(arr));
        Assertions.assertArrayEquals(arr, arr2);
    }

}
