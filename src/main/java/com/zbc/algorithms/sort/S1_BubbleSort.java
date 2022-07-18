package com.zbc.algorithms.sort;


import java.util.Arrays;

/**
 * 冒泡排序
 *
 * @author aaron
 * @since 2022/7/15
 */
public class S1_BubbleSort {

    public static Integer[] sort(Integer[] arr) {

        for (int i = 1; i < arr.length; i++) {
            // 设定一个标记，若为true，则表示此次循环没有进行交换，也就是待排序列已经有序，排序已经完成。
            boolean flag = true;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    SortUtils.swap(arr, j, j + 1);
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
            System.out.println("第" + i + "次排序:" + Arrays.toString(arr));

        }
        return arr;
    }

    public static void main(String[] args) {
        Integer[] s = new Integer[]{2, 4, 55, 35, 67, 13, 9};
        System.out.println("原始数据：" + Arrays.toString(s));
        Integer[] sort = sort(s);
        for (int i = 0; i < sort.length; i++) {
            System.out.println(sort[i]);
        }
    }
}
