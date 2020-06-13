package com.xuhu.study.geekbang.wangzheng.dataStructure.Class11_13.T08;

import com.xuhu.study.Utils.ArraysUtils;

/**
 * @author xuhu
 * @date 2020-06-12 17:09
 */
public class Main {
    public static void main(String[] args) {
        int[][] array = ArraysUtils.randomlyGeneratedIntDoubleArray(10,100000000,1000000000);
        System.out.println("数组创建完毕！\n");
        for(int i = 0; i < array.length; i++){
            System.out.println(FindBigK.findBigK(array[i],9999));
        }

    }
}
