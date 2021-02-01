package com.xuhu.study.geekbang.wangzheng.dataStructure.SpringFestival.D02.T13;


class Solution {
    public int climbStairs(int n) {
        if (n <= 1){
            return 1;
        }
        int a1 = 1;
        int a2 = 2;
        for (int i = 2; i < n; i++) {
            int sum = a1 + a2;
            a1 = a2;
            a2 = sum;
        }
        return a2;
    }
}