package com.xuhu.study.geekbang.wangzheng.dataStructure.Class11_13.T05;

/**
 * @author xuhu
 * @date 2020-06-10 19:11
 * 归并排序
 */
public class SortMergeSolution {
    public static int[] sort(int[] arrays){
        mergeSort(arrays,0,arrays.length-1);
        return arrays;
    }

    private static void mergeSort(int[] array, int begin, int end){
        if(begin >= end) return;
        int mid = (begin + end) / 2;
        mergeSort(array,begin,mid);
        mergeSort(array,mid+1,end);
        merge(array,begin,mid,mid+1,end);
    }

    private static void merge(int[] array, int begin1, int end1, int begin2, int end2){
        int begin = begin1;
        int size = end2-begin1 + 1;
        int[] temp = new int[size];
        int nowIndex = 0;
        while (begin1 <= end1 || begin2 <= end2){
            if (begin2 > end2 || (begin1 <= end1 && array[begin1] <= array[begin2])){
                temp[nowIndex] = array[begin1];
                nowIndex++;
                begin1++;
            }else {
                temp[nowIndex] = array[begin2];
                nowIndex++;
                begin2++;
            }
        }
        nowIndex = 0;
        while (begin <= end2){
            array[begin] = temp[nowIndex];
            begin++;
            nowIndex++;
        }
    }
}
