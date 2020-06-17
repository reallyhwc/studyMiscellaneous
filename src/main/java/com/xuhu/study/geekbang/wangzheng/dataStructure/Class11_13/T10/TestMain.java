package com.xuhu.study.geekbang.wangzheng.dataStructure.Class11_13.T10;

import com.xuhu.study.Utils.ArraysUtils;
import com.xuhu.study.Utils.SystemOutUtil;
import com.xuhu.study.geekbang.wangzheng.dataStructure.Class11_13.T06.SortFastSolution;
import com.xuhu.study.geekbang.wangzheng.dataStructure.Class11_13.T09.BucketSorting;

import java.util.Arrays;

/**
 * @author xuhu
 * @date 2020-06-15 15:41
 *  测试计数排序
 *
 *  在极限情况下 对于3kw级别的高考分数数据（最大值750）
 *  计数排序仅需 1.15s 快排则需10s
 *
 */
public class TestMain {

    private static int NUM_OF_ARRAY = 1;
    private static int LENGTH_OF_ARRAY = 400000000;
    private static int RANDOM_VALUE = 750;

    public static void main(String[] args) {
        int[] array = ArraysUtils.randomlyGeneratedIntDoubleArray(NUM_OF_ARRAY,LENGTH_OF_ARRAY,RANDOM_VALUE)[0];
        int[] array2 = ArraysUtils.randomlyGeneratedIntDoubleArray(NUM_OF_ARRAY,LENGTH_OF_ARRAY,RANDOM_VALUE)[0];

        System.out.println("开始实现计数排序！");
        System.out.println("数组总容量：" + LENGTH_OF_ARRAY);
        System.out.println("划定数组中的最大值" + RANDOM_VALUE);

        long time1 = System.currentTimeMillis();
        CountSort.sort(array,RANDOM_VALUE);
        long time2 = System.currentTimeMillis();
        long differenceTime1 = time2-time1;
        System.out.println("计数序结束！总耗时：" + differenceTime1 + "毫秒");

        // 这里的 自己写的快排无法使用 （用的递归，超长数据会超过递归深度报错）
        // 而系统自带的排序是 非递归的，不会出现这种情况
//        SystemOutUtil.Separate();
//
//        System.out.println("开始实现快速排序！");
//        time1 = System.currentTimeMillis();
//        SortFastSolution.sort(array1);
//        time2 = System.currentTimeMillis();
//        differenceTime1 = time2-time1;
//        System.out.println("快速排序结束！总耗时：" + differenceTime1 + "毫秒");

        SystemOutUtil.Separate();

        System.out.println("开始实现系统自带排序！");
        time1 = System.currentTimeMillis();
        Arrays.sort(array2);
        time2 = System.currentTimeMillis();
        differenceTime1 = time2-time1;
        System.out.println("系统自带排序结束！总耗时：" + differenceTime1 + "毫秒");
    }

}
