package com.zbc.algorithms.sort;

import java.util.Arrays;

/**
 * 插入排序
 *
 * @author aaron
 * @since 2022/7/15
 */
public class S3_InsertionSort {

    public static Integer[] sort(Integer[] arr) {
        // 从第2个元素开始，第一个元素默认有序
        for (int i = 1; i < arr.length; i++) {
            Integer temp = arr[i];
            int j = i;

            while (j > 0 && temp < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }

            if (i != j) {
                arr[j] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Integer[] sort = sort(new Integer[]{4, 2, 55, 35, 67, 13, 9});
        for (int i = 0; i < sort.length; i++) {
            System.out.println(sort[i]);
        }
    }
}
