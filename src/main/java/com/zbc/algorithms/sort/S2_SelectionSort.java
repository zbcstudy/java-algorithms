package com.zbc.algorithms.sort;

import java.util.Arrays;

/**
 * 选择排序
 * 什么数据进去都是 O(n²) 的时间复杂度
 *
 * @author aaron
 * @since 2022/7/15
 */
public class S2_SelectionSort {

    public static Integer[] sort(Integer[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            // 保存最小值的index
            int min = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    // min永远保存的是最小值的index
                    min = j;
                }
            }

            // 最小值的索引发生了变化 进行数据交换
            if (min != i) {
                SortUtils.swap(arr, i, min);
            }
            System.out.println("排序后：" + Arrays.toString(arr));
        }
        return arr;
    }

    public static void main(String[] args) {
        Integer[] sort = sort(new Integer[]{55, 2, 4, 35, 67, 13, 9});
        for (int i = 0; i < sort.length; i++) {
            System.out.println(sort[i]);
        }
    }
}
