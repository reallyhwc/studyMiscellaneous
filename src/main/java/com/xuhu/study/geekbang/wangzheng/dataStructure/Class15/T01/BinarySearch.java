package com.xuhu.study.geekbang.wangzheng.dataStructure.Class15.T01;

/**
 * @author xuhu
 * @date 2020-06-22 9:21
 * 二分查找
 */
public class BinarySearch {

    /**
     * 二分查找 如果存在则返回相应的下标
     * 不存在则返回-1
     * @param arrays 数组
     * @param target 目标值
     * @return 存在则返回下标，不存在则返回-1
     */
    public int search(int[] arrays, int target){
        return search_method(arrays,target,0,arrays.length-1);
    }

    //
    private int search_method(int[] array, int target, int begin, int end){
        if(begin > end){
            return -1;
        }
        int mid = begin + (end-begin)/2 ;
        if(array[mid] == target){
            return mid;
        }else if(array[mid] < target){
            return search_method(array,target,mid+1, end);
        }else {
            return search_method(array,target, begin,mid-1);
        }
    }
}
