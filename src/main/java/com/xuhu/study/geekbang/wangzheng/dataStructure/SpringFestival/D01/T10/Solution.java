package com.xuhu.study.geekbang.wangzheng.dataStructure.SpringFestival.D01.T10;


class Solution {
    public int firstMissingPositive(int[] nums) {
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            // 把每个在 1-len区间的数字，放置在正确的位置（下标从1 开始计算）
            // 这里的思路需要有点巧妙 即 需要注意交换之后的数字对于原数组的影响，
            // 以及两个相同的数字交换之后会产生一个死循环
            while (nums[i] > 0 && nums[i] <= len && nums[nums[i]-1] != nums[i]){
                swap(nums,i,nums[i]-1);
            }
        }
        // 从前往后遍历 取到第一个没有对上的数字
        for (int i = 0; i < len; i++) {
            if (nums[i] != (i+1)){
                return (i+1);
            }
        }
        // 否则返回数组长度+1
        return len + 1;
    }
    private void swap(int[] nums, int i, int j){
        if (i == j){
            return;
        }
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}