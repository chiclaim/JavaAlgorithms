package com.chiclaim.algorithms.sort.exchange_sort;

import com.chiclaim.algorithms.sort.ISort;

/**
 * 快速排序
 *
 * 时间复杂度：平均 O(nlogn) 最优 O(nlogn) 最差O(n^2)
 * <p></p>
 * 空间复杂度：O(logn) - 递归堆栈
 *
 * 是否稳定排序算法：否
 * 如：[3, 1, 5, 1] -> [1, 1, 3, 5]，第一趟最后一个1就会放到前面去了
 * 
 * @author chiclaim
 * @see <a href="https://github.com/chiclaim/">github</a>
 * @since 2022/9/4
 */
public class QuickSort implements ISort {
    @Override
    public void sort(int[] arr) {
        // left 默认是第一个元素的索引
        // right 默认是最后一个元素的索引
        doSort(arr, 0, arr.length - 1);
    }

    private void doSort(int[] arr, int left, int right) {
        int partition;
        if (left < right) {
            // 数组中小于 partition 指向的元素都在 partition 的左侧
            // 数据中大于 partition 指向的元素都在 partition 的右侧
            // 如： [....] partition [....]
            partition = partitionSort(arr, left, right);
            // 对左侧区间重复 partitionSort
            doSort(arr, left, partition - 1);
            // 对右侧区间重复 partitionSort
            doSort(arr, partition + 1, right);
        }
    }

    private int partitionSort(int[] arr, int left, int right) {

        // 选出一个 pivot
        int pivot = arr[left];

        // 将小于 pivot 的元素放在左侧，大于 pivot 的元素放在右侧
        while (left < right) {
            // right 从右往左搜索，如果指向的元素大于等于 pivot 则不需要移动
            while (left < right && arr[right] >= pivot) right--;
            // 此时 right 指向的元素小于 pivot
            // 将 right 指向的元素放在左侧
            if (left < right) {
                arr[left] = arr[right];
                left++;
            }

            // left 从左往右搜索，如果指向的元素小于 pivot 则不需要移动
            while (left < right && arr[left] <= pivot) left++;
            // 此时 left 指向的元素大于 pivot
            // 将 left 指向的元素放到右侧
            if (left < right) {
                arr[right] = arr[left];
                right--;
            }

            // 将 pivot 放在 left 和 right 交汇的位置
            arr[left] = pivot;
        }
        return left;
    }
}
