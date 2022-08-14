package com.chiclaim.algorithms.sort.insertion_sort;

import com.chiclaim.algorithms.sort.ISort;

/**
 * 直接插入排序
 *
 * @author chiclaim
 * @see <a href="https://github.com/chiclaim/">github</a>
 * @since 2022/8/14
 */
public class InsertionSort implements ISort {

    @Override
    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                int current = arr[j];
                int pre = arr[j - 1];
                if (current >= pre) break;
                arr[j] = pre;
                arr[j - 1] = current;
            }
        }
    }

}
