package com.chiclaim.algorithms.sort.insertion_sort;

import com.chiclaim.algorithms.sort.ISort;

/**
 * 直接插入排序
 *
 * @author chiclaim
 * @see <a href="https://github.com/chiclaim/">github</a>
 * @since 2022/8/14
 */
public class DirectionInsertionSort implements ISort {

    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j;
            for (j = i; j > 0; j--) {
                if (current >= arr[j - 1]) break;
                arr[j] = arr[j - 1];
            }
            // 将当前元素插入到合适的位置（如果 j==i 说明当前位置就是最终的位置）
            if (j != i) arr[j] = current;
        }
    }

}
