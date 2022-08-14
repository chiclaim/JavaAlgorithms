# JavaAlgorithms
Java 版数据结构与算法的实现

## 排序

- 排序类型
  - 内排
  - 外排
- 排序策略
  - 插入排序
    - 直接插入排序
    - 希尔排序
  - 选择排序
    - 直接选择排序
    - 堆排序
  - 交换排序
    - 冒泡排序
    - 快速排序
  - 分配排序
    - 桶排序
    - 基数排序
  - 归并排序
    - 二路归并排序
    - 多路归并排序


### 直接插入排序

原理示意图：

![直接插入排序gif图](/images/direction_insertion_sort.gif)

文字描述：

1. 【索引从1开始】索引为 0 的元素，不需要对比，所以索引从 1 开始
2. 【从后往前扫描】取下一个位置的元素(命名为 current)，从后往前扫描
3. 【腾位置】将 current 元素和前一个元素(j-1)对比，如果 current 小于前一个元素，则前一个元素往后移；然后继续和元素 j-2 对比，以此类推，直到 current 大于或等于前面的元素
4. 【插入到腾出的位置】将 current 元素放到腾出的位置

代码实现：[直接插入排序](https://github.com/chiclaim/JavaAlgorithms/blob/main/src/main/java/com/chiclaim/algorithms/sort/insertion_sort/DirectionInsertionSort.java)
