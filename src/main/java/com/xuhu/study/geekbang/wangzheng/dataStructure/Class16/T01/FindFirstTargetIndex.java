package com.xuhu.study.geekbang.wangzheng.dataStructure.Class16.T01;

/**
 * @author xuhu
 * @date 2020-06-30 19:39
 * 获取有序数组中第一个等于目标值的下标
 *
 */
public class FindFirstTargetIndex {

    public int findIndexEasy(int[] nums, int target){
        int length = nums.length;
        int begin = 0;
        int end = length-1;
        while (begin <= end){
            int mid = begin + ((end-begin)>>1);
            if(nums[mid] > target){
                end = mid-1;
            }else if (nums[mid] < target){
                begin = mid+1;
            }else {
                if(begin == 0 || nums[begin-1] != target){
                    return begin;
                }
                end = mid-1;
            }
        }
        return -1;
    }













    public int findIndex(int[] nums, int target){
        int begin = 0;
        int end = nums.length-1;
        while (begin <= end){
            int mid = begin + ((end-begin)>>1);
            if(nums[mid] < target){
                begin = mid+1;
            }else {
                end = mid-1;
            }
        }
        if(begin < nums.length && nums[begin] == target){
            return begin;
        }
        return -1;
    }
}
