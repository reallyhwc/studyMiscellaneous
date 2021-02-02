package com.xuhu.study.geekbang.wangzheng.dataStructure.SpringFestival.D03.T03;

import com.xuhu.study.geekbang.wangzheng.dataStructure.SpringFestival.D03.Sort;

/**
 * @author xuhu
 * @date 2021-02-02 21:33
 */
public class InsertSort implements Sort {

    @Override
    public int[] sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0 && array[j] < array[j - 1]; j--) {
                int temp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;
            }
        }
        return array;
    }
}
