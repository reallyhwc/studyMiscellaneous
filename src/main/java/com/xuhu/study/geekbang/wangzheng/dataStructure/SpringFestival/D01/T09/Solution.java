package com.xuhu.study.geekbang.wangzheng.dataStructure.SpringFestival.D01.T09;

class Solution {
    public int majorityElement(int[] nums) {
        int ans = nums[0];
        int num = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == ans){
                num++;
            }else {
                num--;
                if (num == 0){
                    num = 1;
                    ans = nums[i];
                }
            }
        }
        return ans;
    }
}