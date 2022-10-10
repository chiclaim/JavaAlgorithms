package com.chiclaim.algorithms.sort.selection_sort;

import com.chiclaim.algorithms.sort.ISort;

/**
 * 堆排序（递归算法实现）
 *
 * @author chiclaim
 * @see <a href="https://github.com/chiclaim/">github</a>
 * @see HeapSort
 * @since 2022/10/10
 */
public class HeapSort2 implements ISort {
    @Override
    public void sort(int[] arr) {
        //【第一步：构建堆】
        // 1. 因为叶子结点是没有孩子的，所以从最后一个叶子结点的父节点开始构建，从右往左，逐步建堆
        // 2. parent = (index-1)/2
        int last_parent = (arr.length - 1) / 2;
        // 从右往左，逐步建堆
        for (int i = last_parent; i >= 0; i--) {
            adjustHeap(arr, i, arr.length);
        }

        //【第二步：排序】
        // 1. 将二叉树中的最后一个元素第一个元素交换位置
        // 2. 交换后，最后一个元素脱离二叉树（此时，最大的元素已经在数组的末尾）
        // 3. 交换后，继续维护堆的性质
        for (int i = arr.length - 1; i > 0; i--) {
            swap(arr, 0, i);
            // 交换后，最后一个元素，不用参与堆性质的维护，故 size = i
            adjustHeap(arr, 0, i);
        }
    }

    private void swap(int[] arr, int p1, int p2) {
        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
    }

    /**
     * 维护堆的性质（大顶堆）
     *
     * @param arr   数组
     * @param index 待维护的结点索引
     */
    private void adjustHeap(int[] arr, int index, int size) {
        // 第一步： 对比 index 结点及它的左右孩子的大小，找出最大值
        int largestIndex = index;
        // left child: index * 2 + 1
        // right child: index * 2 + 2
        int leftIndex = index * 2 + 1;
        int right_index = index * 2 + 2;
        if (leftIndex < size && arr[leftIndex] > arr[largestIndex])
            largestIndex = leftIndex;
        if (right_index < size && arr[right_index] > arr[largestIndex])
            largestIndex = right_index;

        // 第二步：将最大值和 index 交换（即放到父节点 index 上）
        if (largestIndex != index) {
            swap(arr, largestIndex, index);
            // 维护子树的堆性质
            adjustHeap(arr, largestIndex, size);
        }
    }
}
