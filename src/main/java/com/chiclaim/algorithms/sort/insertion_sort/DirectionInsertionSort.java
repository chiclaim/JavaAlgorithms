package com.chiclaim.algorithms.sort.insertion_sort;

import com.chiclaim.algorithms.sort.ISort;

import java.util.Arrays;

/**
 * 直接插入排序
 *
 * @author chiclaim
 * @see <a href="https://github.com/chiclaim/">github</a>
 * @since 2022/8/14
 */
public class DirectionInsertionSort implements ISort {

    public void sort(int[] arr) {
        // 索引从 1 开始
        for (int i = 1; i < arr.length; i++) {
            // 保存当前元素
            int current = arr[i];
            int j;
            // 从后往前扫描
            for (j = i; j > 0; j--) {
                // 如果当前的元素大于或等于前一个元素，则不需要腾位置
                if (current >= arr[j - 1]) break;
                arr[j] = arr[j - 1];
            }
            // 将当前元素插入到腾出的位置（如果 j==i 说明前面的元素没有发生过挪动）
            if (j != i) arr[j] = current;
        }
    }

}
