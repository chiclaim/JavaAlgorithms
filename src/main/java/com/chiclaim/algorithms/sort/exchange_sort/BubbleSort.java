package com.chiclaim.algorithms.sort.exchange_sort;

import com.chiclaim.algorithms.sort.ISort;

/**
 * 冒泡排序
 *
 * @author chiclaim
 * @see <a href="https://github.com/chiclaim/">github</a>
 * @since 2022/9/4
 */
public class BubbleSort implements ISort {

    @Override
    public void sort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            boolean swapped = false;
            // 每一趟：当前元素和下一个元素对比
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // 如果一趟下来，没有发生过交换，说明已经排好序了
            if (!swapped) break;
        }

    }
}
