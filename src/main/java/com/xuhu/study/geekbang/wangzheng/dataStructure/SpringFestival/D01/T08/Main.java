package com.xuhu.study.geekbang.wangzheng.dataStructure.SpringFestival.D01.T08;

import com.xuhu.study.Utils.ListUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        ListUtils.printLnLists(solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }
}