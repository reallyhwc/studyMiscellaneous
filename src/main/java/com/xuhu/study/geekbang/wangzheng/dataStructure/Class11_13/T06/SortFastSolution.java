package com.xuhu.study.geekbang.wangzheng.dataStructure.Class11_13.T06;

/**
 * @author xuhu
 * @date 2020-06-10 19:11
 * 归并排序
 */
public class SortFastSolution {
    public static int[] sort(int[] arrays){
        fastSort(arrays,0,arrays.length-1);
        return arrays;
    }


    private static void fastSort(int[] arrays, int begin, int end){
        if(begin > end)return;
        int p = partition(arrays,begin,end);
        fastSort(arrays,begin,p-1);
        fastSort(arrays,p+1,end);
    }

    private static int partition(int[] arrays, int begin, int end){

        int pivot = arrays[end];
        int i = begin;
        for(int j = begin; j < end; j++){
            if(arrays[j] < pivot){
                swap(arrays,i,j);
                i++;
            }
        }
        swap(arrays,i,end);
        return i;
    }

    private static void swap(int[] arrays, int i, int j){
        int temp = arrays[i];
        arrays[i] = arrays[j];
        arrays[j] = temp;
    }

}
