package com.xuhu.study.geekbang.wangzheng.dataStructure.SpringFestival.D02.T12;

import com.xuhu.study.Utils.ListUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        ListUtils.pringlnArrays(solution.maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7},3));
    }
}