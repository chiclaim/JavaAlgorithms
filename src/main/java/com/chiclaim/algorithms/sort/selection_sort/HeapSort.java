package com.chiclaim.algorithms.sort.selection_sort;

import com.chiclaim.algorithms.sort.ISort;

/**
 * 堆排序（非递归实现）
 *
 * @author chiclaim
 * @see <a href="https://github.com/chiclaim/">github</a>
 * @since 2022/10/2
 */
public class HeapSort implements ISort {
    @Override
    public void sort(int[] arr) {
        //【第一步：构建堆】
        for (int i = (arr.length - 1) / 2; i >= 0; i--) {
            //从第一个非叶子结点从下至上，从右至左调整结构
            adjustHeap(arr, i, arr.length);
        }

        //调整堆结构+交换堆顶元素与末尾元素
        for (int i = arr.length - 1; i > 0; i--) {
            //将堆顶元素与末尾元素进行交换
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            //重新对堆进行调整
            adjustHeap(arr, 0, i);
        }
    }

    /**
     * 调整堆
     *
     * @param arr    待排序列
     * @param index 待维护的结点索引
     * @param size 待排序列尾元素索引
     */
    private static void adjustHeap(int[] arr, int index, int size) {
        //将temp作为父节点
        int temp = arr[index];
        //左孩子
        int leftIndex = index * 2 + 1;
        // 因为是完全二叉树，所以先比较左孩子
        while (leftIndex < size) {
            //右孩子
            int rightChild = leftIndex + 1;
            // 如果有右孩子结点，并且右孩子结点的值大于左孩子结点，则选取右孩子结点
            if (rightChild < size && arr[leftIndex] < arr[rightChild]) {
                leftIndex++;
            }

            // 如果父结点的值已经大于孩子结点的值，则直接结束
            if (temp >= arr[leftIndex]) {
                break;
            }

            // 把孩子结点的值赋给父结点
            arr[index] = arr[leftIndex];

            // 选取孩子结点的左孩子结点,继续向下筛选
            index = leftIndex;
            leftIndex = leftIndex * 2 + 1;
        }
        // 将被筛选结点放入最终的位置上
        arr[index] = temp;
    }
}
