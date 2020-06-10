package com.xuhu.study.geekbang.wangzheng.dataStructure.Class11_13.T05;

import com.xuhu.study.Utils.ArraysUtils;
import com.xuhu.study.geekbang.wangzheng.dataStructure.Class11_13.T03.SortSelectSolution;

/**
 * @author xuhu
 * @date 2020-06-10 19:44
 */
public class TestTime {

    private static int NUM_OF_ARRAY = 100;
    private static int LENGTH_OF_ARRAY = 1000000;
    private static int RANDOM_VALUE = 1000000;

    public static void main(String[] args) {
        long time1 = System.currentTimeMillis();
        int[][] arrays1 = ArraysUtils.randomlyGeneratedIntDoubleArray(NUM_OF_ARRAY,LENGTH_OF_ARRAY,RANDOM_VALUE);
        long time2 = System.currentTimeMillis();
        long differenceTime1 = time2-time1;
        System.out.println("生成二维数组" + NUM_OF_ARRAY + "*" + LENGTH_OF_ARRAY + "耗时：" + differenceTime1 + "毫秒");

        System.out.println("开始启动插入排序！");
        time1 = System.currentTimeMillis();
        for(int i = 0; i < NUM_OF_ARRAY; i++){
            SortMergeSolution.sort(arrays1[i]);
        }
        time2 = System.currentTimeMillis();
        differenceTime1 = time2-time1;
        System.out.println("插入排序结束！总耗时：" + differenceTime1 + "毫秒");
    }
}
