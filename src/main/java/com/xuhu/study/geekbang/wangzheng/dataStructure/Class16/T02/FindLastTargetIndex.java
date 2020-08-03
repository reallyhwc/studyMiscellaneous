package com.xuhu.study.geekbang.wangzheng.dataStructure.Class16.T02;

/**
 * @author xuhu
 * @date 2020-06-30 19:40
 * 获取有序数组中最后一个等于目标值的下标
 */
public class FindLastTargetIndex {

    public int findIndex(int[] nums, int target) {
        int length = nums.length;
        int begin = 0;
        int end = length - 1;
        while (begin < end) {
            int mid = begin + ((end - begin) >> 1);
            if (mid < target){
                begin = mid + 1;
            }else if (mid > target){
                end = mid - 1;
            }else {
                if (mid == length - 1 || nums[mid] < nums[mid+1]){
                    return mid;
                }else {
                    begin = mid + 1;
                }
            }
        }
        return -1;
    }
}
