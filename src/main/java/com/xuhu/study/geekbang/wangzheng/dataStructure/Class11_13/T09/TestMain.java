package com.xuhu.study.geekbang.wangzheng.dataStructure.Class11_13.T09;

import com.xuhu.study.Utils.ArraysUtils;
import com.xuhu.study.geekbang.wangzheng.dataStructure.Class11_13.T06.SortFastSolution;

import java.util.Arrays;

/**
 * @author xuhu
 * @date 2020-06-15 14:32
 *
 *
 * 为啥我写的排序   比快排慢这么多...
 *
 *
 */
public class TestMain {

    private static int NUM_OF_ARRAY = 1;
    private static int LENGTH_OF_ARRAY = 10000000;
    private static int RANDOM_VALUE = 10000000;
    private static int BUCKET_NUM = 100;

    public static void main(String[] args) {
        int[] array = ArraysUtils.randomlyGeneratedIntDoubleArray(NUM_OF_ARRAY,LENGTH_OF_ARRAY,RANDOM_VALUE)[0];
        int[] array1 = ArraysUtils.randomlyGeneratedIntDoubleArray(NUM_OF_ARRAY,LENGTH_OF_ARRAY,RANDOM_VALUE)[0];
        int[] array2 = ArraysUtils.randomlyGeneratedIntDoubleArray(NUM_OF_ARRAY,LENGTH_OF_ARRAY,RANDOM_VALUE)[0];

        System.out.println("开始实现桶排序！");
        System.out.println("数组总容量：" + LENGTH_OF_ARRAY);
        System.out.println("划定的桶最大值" + RANDOM_VALUE);
        System.out.println("桶数：" + BUCKET_NUM);
        long time1 = System.currentTimeMillis();
        BucketSorting.sort(array,RANDOM_VALUE,BUCKET_NUM);
        long time2 = System.currentTimeMillis();
        long differenceTime1 = time2-time1;
        System.out.println("桶排序结束！总耗时：" + differenceTime1 + "毫秒");

        System.out.println("开始实现快速排序！");
        time1 = System.currentTimeMillis();
        SortFastSolution.sort(array1);
        time2 = System.currentTimeMillis();
        differenceTime1 = time2-time1;
        System.out.println("快速排序结束！总耗时：" + differenceTime1 + "毫秒");

        System.out.println("开始实现系统自带排序！");
        time1 = System.currentTimeMillis();
        Arrays.sort(array2);
        time2 = System.currentTimeMillis();
        differenceTime1 = time2-time1;
        System.out.println("系统自带排序结束！总耗时：" + differenceTime1 + "毫秒");

        System.out.println("开始实现创建数组！");
        time1 = System.currentTimeMillis();
        int[][] buckets = new int[BUCKET_NUM][LENGTH_OF_ARRAY];
        time2 = System.currentTimeMillis();
        differenceTime1 = time2-time1;
        System.out.println("创建数组结束！总耗时：" + differenceTime1 + "毫秒");
    }

}
