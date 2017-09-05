package com.alost.www.algorithm.util;

/**
 * Created by Alost on 17/9/5.
 * 排序算法
 */
public class SortUtil {

    /**
     * 插入排序算法
     *
     * @param arr
     */
    public static int[] insertSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int j;
            for (j = i - 1; j >= 0 && temp < arr[j]; j--) {
                arr[j + 1] = arr[j];
            }

            arr[j + 1] = temp;
        }

        return arr;

    }
}
