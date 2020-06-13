package com.xuhu.study.Utils;

import java.util.Random;

/**
 * @author xuhu
 * @date 2020-06-09 19:25
 */
public class ArraysUtils {

    public static void randomlyGeneratedIntDoubleArray(int[][] arrays, int randomMaxValue){
        int x = arrays.length;
        int y = arrays[0].length;
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                arrays[i][j] = (int) (Math.random()*randomMaxValue);
            }
        }
    }

    public static int[][] randomlyGeneratedIntDoubleArray(int x, int y, int randomMaxValue){
        long time1 = System.currentTimeMillis();
        int[][] arrays = new int[x][y];
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                arrays[i][j] = (int) (Math.random()*randomMaxValue);
            }
        }
        long time2 = System.currentTimeMillis();
        long differenceTime1 = time2-time1;
        System.out.println("生成二维数组" + x + "*" + y + "耗时：" + differenceTime1 + "毫秒");
        return arrays;
    }
}
