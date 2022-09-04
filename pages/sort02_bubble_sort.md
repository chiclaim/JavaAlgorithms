

## 冒泡排序

冒泡排序是一个非常简单的排序算法：它逐个元素地重复遍历输入列表，将当前元素与后面的元素进行比较，并在需要时交换它们的值。 重复这些遍历列表，直到在遍历期间不必执行交换，这意味着列表已完全排序

这个简单的算法在现实世界的使用中表现不佳，主要用作教育工具。时间复杂度为: O(n^2)。冒泡排序算法是稳定的。

算法基本原理：

1. 当前元素(j)和后面一个元素(j+1)进行比较，需要则交换。如此往复，直到最后一个元素
2. 重复上面的步骤(重复次数为i),直到步骤1没有发生过交换，整个算法完毕

算法实现：

```
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

```