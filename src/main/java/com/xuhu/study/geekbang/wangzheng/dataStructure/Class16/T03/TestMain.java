package com.xuhu.study.geekbang.wangzheng.dataStructure.Class16.T03;


import com.xuhu.study.geekbang.wangzheng.dataStructure.Class16.T02.FindLastTargetIndex;

/**
 * @author xuhu
 * @date 2020-06-30 19:52
 */
public class TestMain {

    public static void main(String[] args) {
        FindFirstNotLessThanTarget find = new FindFirstNotLessThanTarget();
        System.out.println(find.findIndex(new int[]{1,3,4,5,6,8,8,8,11,18},7));
    }

}
