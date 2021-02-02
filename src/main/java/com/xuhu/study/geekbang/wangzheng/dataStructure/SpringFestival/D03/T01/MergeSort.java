package com.xuhu.study.geekbang.wangzheng.dataStructure.SpringFestival.D03.T01;

import com.xuhu.study.geekbang.wangzheng.dataStructure.SpringFestival.D03.Sort;

/**
 * @author xuhu
 * @date 2021-02-02 19:44
 */
public class MergeSort implements Sort {

    @Override
    public int[] sort(int[] array) {
        if (array == null || array.length <= 1) {
            return array;
        }
        sort(array, 0, array.length - 1);
        return array;
    }

    private void sort(int[] array, int begin, int end) {
        if (begin < end) {
            int mid = begin + (end - begin >> 1);
            sort(array, begin, mid);
            sort(array, mid + 1, end);
            merge(array, begin, mid, end);
        }
    }

    private void merge(int[] array, int begin, int mid, int end) {
        if (begin < end) {
            int size = end - begin + 1;
            int[] temp = new int[size];
            int left = begin;
            int right = mid + 1;
            for (int i = 0; i < size; i++) {
                int num1 = left <= mid ? array[left] : Integer.MAX_VALUE;
                int num2 = right <= end ? array[right] : Integer.MAX_VALUE;
                if (num1 <= num2) {
                    temp[i] = num1;
                    left++;
                } else {
                    temp[i] = num2;
                    right++;
                }
            }
            System.arraycopy(temp, 0, array, begin, size);
        }
    }
}
