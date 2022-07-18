package com.zbc.algorithms.sort;

import java.util.Arrays;

/**
 * 堆排序
 *
 * @author aaron
 * @since 2022/7/15
 */
public class S7_HeapSort {

    /**
     * 大顶堆
     *
     * @param arr -
     * @return -
     */
    public Integer[] sort(Integer[] arr) {

        int len = arr.length;

        buildMaxHeap(arr, len);

        for (int i = len - 1; i > 0; i--) {
            SortUtils.swap(arr, 0, i);
            len--;
            heapify(arr, 0, len);
            System.out.println("堆排序后：" + Arrays.toString(arr));
        }
        return arr;
    }

    private void buildMaxHeap(Integer[] arr, int len) {
        for (int i = len / 2; i >= 0; i--) {
            heapify(arr, i, len);
        }
    }

    private void heapify(Integer[] arr, int i, int len) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;

        if (left < len && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < len && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            SortUtils.swap(arr, i, largest);
            heapify(arr, largest, len);
        }
    }

    public static void main(String[] args) {
        S7_HeapSort heapSort = new S7_HeapSort();
        Integer[] params = new Integer[]{4, 2, 55, 35, 67, 13, 9, 88, 17, 56, 1, 22};
        heapSort.sort(params); // size = 12
        System.out.println(Arrays.toString(params));
    }
}
