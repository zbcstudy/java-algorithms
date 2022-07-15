package com.zbc.algorithms.sort;

/**
 * @author aaron
 * @since 2022/7/15
 */
public class S4_ShellSort {

    public static Integer[] sort(Integer[] arr) {
        int length = arr.length;
        int temp;
        for (int step = length / 2; step >= 1; step /= 2) {
            // 以下类似插入排序
            for (int i = step; i < length; i++) {
                temp = arr[i];
                int j = i - step;
                while (j >= 0 && arr[j] > temp) {
                    arr[j + step] = arr[j];
                    j -= step;
                }
                arr[j + step] = temp;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        Integer[] sort = sort(new Integer[]{4, 2, 55, 35, 67, 13, 9, 88, 17, 56, 1, 22}); // size = 12
        // 在step =6 时
        // [4, 2, 17, 35, 1, 13, 9,  88, 55, 56, 67, 22]
        // step = 3
        // [4, 1, 13, 9,  2, 17, 35, 67, 22, 56, 88, 55]
        // step = 1
        // [1, 2, 4, 9, 13, 17, 22, 35, 55, 56, 67, 88]
        for (int i = 0; i < sort.length; i++) {
            System.out.println(sort[i]);
        }
    }
}
