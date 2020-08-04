package com.xuhu.study.geekbang.wangzheng.dataStructure.Class16.T04;

/**
 * @author xuhu
 * @date 2020-06-30 19:47
 * 查找最后一个小于等于给定值的元素
 */
public class FindLastNotLessThanTarget {

    public int findIndex(int[] nums, int target) {
        int length = nums.length;
        int begin = 0;
        int end = length - 1;
        while (begin <= end) {
            int mid = begin + ((end - begin) >> 1);
            if (nums[mid] > target){
                end = mid - 1;
            }else {
                if (mid == length-1 || nums[mid+1] > target){
                    return mid;
                }else {
                    begin = mid + 1;
                }
            }
        }
        return -1;
    }
}
