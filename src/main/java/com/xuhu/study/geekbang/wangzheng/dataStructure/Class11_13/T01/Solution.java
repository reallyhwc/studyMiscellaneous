package com.xuhu.study.geekbang.wangzheng.dataStructure.Class11_13.T01;

/**
 * @author xuhu
 * @date 2020-06-08 19:52
 * 冒泡排序
 */
public class Solution {

    public static int[] sort(int[] arrays){
        if(arrays == null || arrays.length == 0)return arrays;
        for(int i = 0; i < arrays.length; i++){
            for(int j = i+1; j < arrays.length; j++){
                if(arrays[i] > arrays[j]){
                    swap(arrays,i,j);
                }
            }
        }
        return arrays;
    }

    private static void swap(int[] arrays, int i, int j){
        int temp = arrays[i];
        arrays[i] = arrays[j];
        arrays[j] = temp;
    }
}
