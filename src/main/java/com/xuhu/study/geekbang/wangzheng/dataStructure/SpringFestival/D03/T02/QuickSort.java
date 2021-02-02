package com.xuhu.study.geekbang.wangzheng.dataStructure.SpringFestival.D03.T02;

import com.xuhu.study.geekbang.wangzheng.dataStructure.SpringFestival.D03.Sort;

/**
 * @author xuhu
 * @date 2021-02-02 20:14
 */
public class QuickSort implements Sort {

    @Override
    public int[] sort(int[] array) {
        quickSort(array, 0, array.length - 1);
        return array;
    }

    private void quickSort(int[] array, int begin, int end){
        if (begin < end){
            int partIndex = partition(array, begin, end);
            quickSort(array, begin, partIndex - 1);
            quickSort(array, partIndex + 1, end);
        }
    }

    private int partition(int[] array, int begin, int end) {
        int targetNum = array[end];
        int i = begin;
        for (int j = begin; j < end; j++) {
            if (array[j] < targetNum){
                swap(array,i,j);
                i++;
            }
        }
        swap(array,i,end);
        return i;
    }

    private void swap(int[] array, int begin, int end){
        int temp = array[begin];
        array[begin] = array[end];
        array[end] = temp;
    }
}
