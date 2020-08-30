package com.xuhu.study.geekbang.wangzheng.dataStructure.Class23.T01;

import com.xuhu.study.Utils.ListUtils;

/**
 * @author xuhu
 * @date 2020-08-30 16:17
 */
public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        // 测试计算卡塔兰数
        System.out.println(solution.catalanNum(1));
        System.out.println(solution.catalanNum(2));
        System.out.println(solution.catalanNum(3));
        System.out.println(solution.catalanNum(4));
        System.out.println(solution.catalanNum(5));
        // 测试计算阶乘
        System.out.println(solution.factorial(1));
        System.out.println(solution.factorial(2));
        System.out.println(solution.factorial(3));
        System.out.println(solution.factorial(4));
        System.out.println(solution.factorial(5));

        System.out.println(solution.method(ListUtils.createListByArray(new Integer[]{1,3,5,6,9,10})));
    }
}
