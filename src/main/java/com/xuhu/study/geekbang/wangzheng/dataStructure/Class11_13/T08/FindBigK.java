package com.xuhu.study.geekbang.wangzheng.dataStructure.Class11_13.T08;

/**
 * @author xuhu
 * @date 2020-06-12 16:59
 * 如何在 O(n) 的时间复杂度内查找一个无序数组中的第 K 大元素
 */
public class FindBigK {

    public static int findBigK(int[] array, int K){
        if(null == array || array.length == 0){
            return -1;
        }
        if(K <= 0){
            return -1;
        }
        return findBigK_method(array,K-1,0,array.length-1);
    }

    private static int findBigK_method(int[] array, int k, int begin, int end){
        int p = partition(array,begin,end);
        if(p == k){
            return array[k];
        }
        if(p < k){
            return findBigK_method(array,k,p+1,end);
        }
        return findBigK_method(array,k,begin,p-1);
    }

    private static int partition(int[] arrays, int begin, int end){

        int pivot = arrays[end];
        int i = begin;
        for(int j = begin; j < end; j++){
            if(arrays[j] > pivot){
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
