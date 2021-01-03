package com.xuhu.study.geekbang.wangzheng.dataStructure.SpringFestival.D01.T08;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ansList = new ArrayList<>();
        if (nums == null || nums.length < 3) {
            return ansList;
        }
        Arrays.sort(nums);
        int len = nums.length;

        for (int i = 0; i < len - 2; i++) {
            int begin = i + 1;
            int end = len - 1;
            while (begin < end) {
                int temp = nums[begin] + nums[end];
                if (temp == -nums[i]) {
                    ansList.add(Arrays.asList(nums[i], nums[begin], nums[end]));
                    while (begin < end && nums[begin] == nums[begin + 1]) begin++;
                    while (begin < end && nums[end] == nums[end - 1]) end--;
                    begin++;
                    end--;
                } else if (temp < -nums[i]) {
                    begin++;
                } else {
                    end--;
                }
            }
            while (i < len - 3 && nums[i] == nums[i + 1]) i++;
        }

        return ansList;
    }
}