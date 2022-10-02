package com.chiclaim.algorithms.sort.selection_sort;

import com.chiclaim.algorithms.sort.ISort;

/**
 * 直接选择排序
 * <p></p>
 * 主要思想：每次遍历找到最小值，然后交换
 *
 * <p></p>
 * 时间复杂度:O(n^2)
 * 空间复杂度:O(1)
 * 稳定性:是
 *
 * @author chiclaim
 * @see <a href="https://github.com/chiclaim/">github</a>
 * @since 2022/10/2
 */
public class StraightSelectionSort implements ISort {

    @Override
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // 循环找到最小值
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) minIndex = j;
            }
            // 交换位置
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}
