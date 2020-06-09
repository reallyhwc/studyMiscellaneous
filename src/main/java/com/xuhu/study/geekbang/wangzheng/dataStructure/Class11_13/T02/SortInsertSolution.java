package com.xuhu.study.geekbang.wangzheng.dataStructure.Class11_13.T02;

/**
 * @author xuhu
 * @date 2020-06-08 19:52
 * 插入排序
 */
public class SortInsertSolution {

    public static int[] sort(int[] arrays){
        if(arrays == null || arrays.length == 0)return arrays;
        for(int i = 1; i < arrays.length; i++){
            int value = arrays[i];
            int j = i-1;
            for(; j >= 0; j--){
                if(arrays[j] > value){
                    arrays[j+1] = arrays[j];
                }else {
                    break;
                }
            }
            arrays[j+1] = value;
        }
        return arrays;

    }
}
