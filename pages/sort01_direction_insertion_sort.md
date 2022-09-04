

## 直接插入排序

**原理示意图：**

![直接插入排序gif图](/images/direction_insertion_sort.gif)

**文字描述：**

1. 【索引从1开始】索引为 0 的元素，不需要对比，所以索引从 1 开始
2. 【从后往前扫描】取下一个位置的元素(命名为 current)，从后往前扫描
3. 【腾位置】将 current 元素和前一个元素(j-1)对比，如果 current 小于前一个元素，则前一个元素往后移；然后继续和元素 j-2 对比，以此类推，直到 current 大于或等于前面的元素
4. 【插入到腾出的位置】将 current 元素放到腾出的位置

直接插入排序时间复杂度为：O(n^2)。直接插入排序时稳定的。

**代码实现：**

```
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
```