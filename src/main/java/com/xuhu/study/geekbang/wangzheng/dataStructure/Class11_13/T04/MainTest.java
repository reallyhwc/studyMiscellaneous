package com.xuhu.study.geekbang.wangzheng.dataStructure.Class11_13.T04;

import com.xuhu.study.Utils.ArraysUtils;
import com.xuhu.study.geekbang.wangzheng.dataStructure.Class11_13.T01.SortBubbleSolution;
import com.xuhu.study.geekbang.wangzheng.dataStructure.Class11_13.T02.SortInsertSolution;
import com.xuhu.study.geekbang.wangzheng.dataStructure.Class11_13.T03.SortSelectSolution;
import com.xuhu.study.geekbang.wangzheng.dataStructure.Class11_13.T05.SortMergeSolution;
import com.xuhu.study.geekbang.wangzheng.dataStructure.Class11_13.T06.SortFastSolution;

/**
 * @author xuhu
 * @date 2020-06-09 19:19
 * 测试冒泡排序，插入排序和选择排序的  耗时
 */
public class MainTest {

    private static int NUM_OF_ARRAY = 50;
    private static int LENGTH_OF_ARRAY = 20000;
    private static int RANDOM_VALUE = 100000;

    public static void main(String[] args) {
        long time1 = System.currentTimeMillis();
        int[][] arrays1 = ArraysUtils.randomlyGeneratedIntDoubleArray(NUM_OF_ARRAY,LENGTH_OF_ARRAY,RANDOM_VALUE);
        int[][] arrays2 = ArraysUtils.randomlyGeneratedIntDoubleArray(NUM_OF_ARRAY,LENGTH_OF_ARRAY,RANDOM_VALUE);
        int[][] arrays3 = ArraysUtils.randomlyGeneratedIntDoubleArray(NUM_OF_ARRAY,LENGTH_OF_ARRAY,RANDOM_VALUE);
        int[][] arrays4 = ArraysUtils.randomlyGeneratedIntDoubleArray(NUM_OF_ARRAY,LENGTH_OF_ARRAY,RANDOM_VALUE);
        int[][] arrays5 = ArraysUtils.randomlyGeneratedIntDoubleArray(NUM_OF_ARRAY,LENGTH_OF_ARRAY,RANDOM_VALUE);
        long time2 = System.currentTimeMillis();
        long differenceTime1 = time2-time1;
        System.out.println("生成二维数组" + NUM_OF_ARRAY + "*" + LENGTH_OF_ARRAY + "耗时：" + differenceTime1 + "毫秒");

        System.out.println("开始启动冒泡排序！");
        time1 = System.currentTimeMillis();
        for(int i = 0; i < NUM_OF_ARRAY; i++){
            SortBubbleSolution.sort(arrays1[i]);
        }
        time2 = System.currentTimeMillis();
        differenceTime1 = time2-time1;
        System.out.println("冒泡排序结束！总耗时：" + differenceTime1 + "毫秒");

        System.out.println("开始启动插入排序！");
        time1 = System.currentTimeMillis();
        for(int i = 0; i < NUM_OF_ARRAY; i++){
            SortInsertSolution.sort(arrays2[i]);
        }
        time2 = System.currentTimeMillis();
        differenceTime1 = time2-time1;
        System.out.println("插入排序结束！总耗时：" + differenceTime1 + "毫秒");

        System.out.println("开始启动选择排序！");
        time1 = System.currentTimeMillis();
        for(int i = 0; i < NUM_OF_ARRAY; i++){
            SortSelectSolution.sort(arrays3[i]);
        }
        time2 = System.currentTimeMillis();
        differenceTime1 = time2-time1;
        System.out.println("选择排序结束！总耗时：" + differenceTime1 + "毫秒");

        System.out.println("开始启动归并排序！");
        time1 = System.currentTimeMillis();
        for(int i = 0; i < NUM_OF_ARRAY; i++){
            SortMergeSolution.sort(arrays4[i]);
        }
        time2 = System.currentTimeMillis();
        differenceTime1 = time2-time1;
        System.out.println("归并排序结束！总耗时：" + differenceTime1 + "毫秒");

        System.out.println("开始启动快速排序！");
        time1 = System.currentTimeMillis();
        for(int i = 0; i < NUM_OF_ARRAY; i++){
            SortFastSolution.sort(arrays5[i]);
        }
        time2 = System.currentTimeMillis();
        differenceTime1 = time2-time1;
        System.out.println("快速排序结束！总耗时：" + differenceTime1 + "毫秒");
    }
}
