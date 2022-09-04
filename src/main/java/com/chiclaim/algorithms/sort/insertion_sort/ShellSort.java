package com.chiclaim.algorithms.sort.insertion_sort;

import com.chiclaim.algorithms.sort.ISort;

/**
 * 希尔排序
 *
 * @author chiclaim
 * @see <a href="https://github.com/chiclaim/">github</a>
 * @since 2022/9/3
 */
public class ShellSort implements ISort {

    // gap 间隙的意思，间隔几个元素为同一组(arr[index], arr[index+gap*1]，arr[index+gap*2])
    // [2, 3, 6, 1, 8, 7, 4, 9, 0, 5]
    // gap = 10/2 = 5 共5组
    // [2,7],[3,4],[6,9],[1,0],[8,5]   
    // [2, 3, 6, 0, 5, 7, 4, 9, 1, 8]
    // gap = 5/2 = 2 共2组
    // [2,6,5,4,1],[3,0,7,9,8]
    // [1, 0, 2, 3, 4, 7, 5, 8, 6, 9]
    // gap = 1/2 = 1
    // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]


    public void sort(int[] arr) {
        //初始 gap，默认设置为数组长度的一半
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            //System.out.println("----gap=" + gap);
            //从第 gap 个元素开始对相同的组进行直接插入排序操作
            for (int i = gap; i < arr.length; i++) {
                int current = arr[i];
                int j;
                // 从后往前扫描
                for (j = i; j > 0; j -= gap) {
                    // current 和前面第 gap 个元素对比（和直接插入排序类似，只不过直接插入排序的gap=1）
                    if (j - gap < 0 || current >= arr[j - gap]) break;
                    arr[j] = arr[j - gap];
                }
                arr[j] = current;
            }
        }
        // 总结：从上可以看出，希尔排序和直接插入排序代码很类似，直接插入排序是 j-1, 希尔排序时 j-gap, 可以将直接插入排序的 gap 看做 1
        // 然后在直接插入排序的外层加上 gap 循环
    }
}
