package com.xuhu.study.geekbang.wangzheng.dataStructure.Class11_13.T07;

import com.xuhu.study.Utils.ArraysUtils;
import com.xuhu.study.geekbang.wangzheng.dataStructure.Class11_13.T05.SortMergeSolution;
import com.xuhu.study.geekbang.wangzheng.dataStructure.Class11_13.T06.SortFastSolution;

/**
 * @author xuhu
 * @date 2020-06-12 15:52
 * 测试快排和归并排序的速度
 */
public class TestFastSortAndMergeSort {

    private static int NUM_OF_ARRAY = 10;
    private static int LENGTH_OF_ARRAY = 1000000;
    private static int RANDOM_VALUE = 1000000;

    public static void main(String[] args) {
        test();
    }

    public static void test(){
        long time1 = System.currentTimeMillis();
        int[][] arrays1 = ArraysUtils.randomlyGeneratedIntDoubleArray(NUM_OF_ARRAY,LENGTH_OF_ARRAY,RANDOM_VALUE);
        int[][] arrays2 = ArraysUtils.randomlyGeneratedIntDoubleArray(NUM_OF_ARRAY,LENGTH_OF_ARRAY,RANDOM_VALUE);
        long time2 = System.currentTimeMillis();
        long differenceTime1 = time2-time1;
        System.out.println("生成二维数组" + NUM_OF_ARRAY + "*" + LENGTH_OF_ARRAY + "耗时：" + differenceTime1 + "毫秒");

        System.out.println("开始启动归并排序！");
        time1 = System.currentTimeMillis();
        for(int i = 0; i < NUM_OF_ARRAY; i++){
            SortMergeSolution.sort(arrays1[i]);
        }
        time2 = System.currentTimeMillis();
        differenceTime1 = time2-time1;
        System.out.println("插入归并结束！总耗时：" + differenceTime1 + "毫秒");

        System.out.println("开始实现快速排序！");
        time1 = System.currentTimeMillis();
        for(int i = 0; i < NUM_OF_ARRAY; i++){
            SortFastSolution.sort(arrays2[i]);
        }
        time2 = System.currentTimeMillis();
        differenceTime1 = time2-time1;
        System.out.println("快速排序结束！总耗时：" + differenceTime1 + "毫秒");
    }
}
