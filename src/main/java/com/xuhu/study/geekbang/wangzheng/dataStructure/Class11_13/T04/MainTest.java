package com.xuhu.study.geekbang.wangzheng.dataStructure.Class11_13.T04;

import com.xuhu.study.Utils.ArraysUtils;
import com.xuhu.study.geekbang.wangzheng.dataStructure.Class11_13.T01.SortBubbleSolution;
import com.xuhu.study.geekbang.wangzheng.dataStructure.Class11_13.T02.SortInsertSolution;
import com.xuhu.study.geekbang.wangzheng.dataStructure.Class11_13.T03.SortSelectSolution;

/**
 * @author xuhu
 * @date 2020-06-09 19:19
 * 测试冒泡排序，插入排序和选择排序的  耗时
 */
public class MainTest {

    private static int NUM_OF_ARRAY = 10000;
    private static int LENGTH_OF_ARRAY = 1000;
    private static int RANDOM_VALUE = 100000;

    public static void main(String[] args) {
        long time1 = System.currentTimeMillis();
        int[][] arrays1 = new int[NUM_OF_ARRAY][LENGTH_OF_ARRAY];
        int[][] arrays2 = new int[NUM_OF_ARRAY][LENGTH_OF_ARRAY];
        int[][] arrays3 = new int[NUM_OF_ARRAY][LENGTH_OF_ARRAY];
        ArraysUtils.randomlyGeneratedIntDoubleArray(arrays1,RANDOM_VALUE);
        ArraysUtils.randomlyGeneratedIntDoubleArray(arrays2,RANDOM_VALUE);
        ArraysUtils.randomlyGeneratedIntDoubleArray(arrays3,RANDOM_VALUE);
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
    }
}
