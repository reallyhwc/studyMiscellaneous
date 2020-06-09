package com.xuhu.study.geekbang.wangzheng.dataStructure.Class11_13.T03;

/**
 * @author xuhu
 * @date 2020-06-08 19:52
 * 选择排序 每次选择出最小的一个放在最末尾
 */
public class SortSelectSolution {

    public static int[] sort(int[] arrays){
        if(arrays == null || arrays.length == 0)return arrays;
        for(int i = 0; i < arrays.length; i++){
            int minValue = arrays[i];
            int minIndex = i;
            for(int j = i+1; j < arrays.length; j++){
                if(arrays[j] < minValue){
                    minValue = arrays[j];
                    minIndex = j;
                }
            }
            if(minIndex != i){
                swap(arrays,i,minIndex);
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
