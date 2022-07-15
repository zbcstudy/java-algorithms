package com.zbc.algorithms.sort;

import java.util.Arrays;

/**
 * @author aaron
 * @since 2022/7/15
 */
public class S5_MergeSort {

    /**
     * 归并排序实现
     *
     * @param list
     * @return
     */
    public static void mergeSort(int[] list) {

        if (list.length > 1) {
            int[] firstHalf = new int[list.length / 2];
            System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
            mergeSort(firstHalf);

            int secondHalfLength = list.length - list.length / 2;
            int[] secondHalf = new int[secondHalfLength];
            System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);
            mergeSort(secondHalf);

            merge(firstHalf, secondHalf, list);
        }

        System.out.println(Arrays.toString(list));
    }

    private static void merge(int[] list1, int[] list2, int[] temp) {
        int current1 = 0;
        int current2 = 0;
        int current3 = 0;

        while (current1 < list1.length && current2 < list2.length) {
            if (list1[current1] < list2[current2]) {
                temp[current3++] = list1[current1++];
            } else {
                temp[current3++] = list2[current2++];
            }
        }
        while (current1 < list1.length) {
            temp[current3++] = list1[current1++];
        }
        while (current2 < list2.length) {
            temp[current3++] = list2[current2++];
        }
    }

    public static void main(String[] args) {
        mergeSort(new int[]{4, 2, 55, 35, 67, 13, 9, 88, 17, 56, 1, 22}); // size = 12
    }
}
