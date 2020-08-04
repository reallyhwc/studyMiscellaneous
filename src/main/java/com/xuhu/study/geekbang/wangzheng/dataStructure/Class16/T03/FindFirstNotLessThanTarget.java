package com.xuhu.study.geekbang.wangzheng.dataStructure.Class16.T03;

/**
 * @author xuhu
 * @date 2020-06-30 19:41
 * 获取数组中第一个不比下标值小的Index
 */
public class FindFirstNotLessThanTarget {

    public int findIndex(int[] nums, int target) {
        int length = nums.length;
        int begin = 0;
        int end = length - 1;
        while (begin <= end) {
            int mid = begin + ((end - begin) >> 1);
            if (nums[mid] < target){
                begin = mid+1;
            }else {
                if (mid == 0 || nums[mid-1] < target){
                    return mid;
                }else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
