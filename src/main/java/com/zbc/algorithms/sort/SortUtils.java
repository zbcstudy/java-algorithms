package com.zbc.algorithms.sort;

/**
 * @author aaron
 * @since 2022/7/15
 */
public class SortUtils {

    /**
     * 数据交换
     * @param array 原始数组
     * @param idx -
     * @param idy -
     * @param <T> -
     * @return -
     */
    public static <T> boolean swap(T[] array, int idx, int idy) {
        T swap = array[idx];
        array[idx] = array[idy];
        array[idy] = swap;
        return true;
    }

}
