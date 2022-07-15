package com.zbc.algorithms.sort;

import java.util.PriorityQueue;

/**
 * @author aaron
 * @since 2022/7/15
 */
public class S7_HeapSort_jdk {


    public static void main(String[] args) {
        int[] params = new int[]{4, 2, 55, 35, 67, 13, 9, 88, 17, 56, 1, 22};
        PriorityQueue<Integer> heapQueue = new PriorityQueue();
        for (int i = 0; i < params.length; i++) {
            heapQueue.add(params[i]);
        }

        for (int i = 0; i < params.length; i++) {
            System.out.println(heapQueue.poll());
        }
    }

}
