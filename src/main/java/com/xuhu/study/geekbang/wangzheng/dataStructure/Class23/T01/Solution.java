package com.xuhu.study.geekbang.wangzheng.dataStructure.Class23.T01;

import java.util.List;

/**
 * @author xuhu
 * @date 2020-08-30 15:44
 * 给定一组数据，比如 1，3，5，6，9，10。你来算算，可以构建出多少种不同的二叉树？
 *
 * 那么本题所需要打算解决的问题是，输入一个长度为N的数字数组，求计算能构建出多少种不通的二叉树
 */
public class Solution {

    /**
     *
     * 确定两点：
     * 1）n个数，即n个节点，能构造出多少种不同形态的树？   (卡特兰数)
     * 2）n个数，有多少种不同的排列？ 全排列计算
     * 当确定以上两点，将【1)的结果】乘以 【2)的结果】，即为最终的结果。
     * 但是有一个注意的点： 如果n中有相等的数，产生的总排列数就不是n！了哟
     * @param list
     * @return
     */
    public long method(List<Integer> list){
        int len = list.size();
        return catalanNum(len) * factorial(len);
    }

    /**
     * 快速计算卡特兰数
     * 具体可以后期自己深入了解一下卡特兰数
     * @param n
     * @return
     */
    public long catalanNum(int n){
        return (int)((factorial(2*n) / ((factorial(n+1) * factorial(n)))));
    }

    /**
     * 计算阶乘
     * @param n
     * @return
     */
    public long factorial(int n){
        if (n < 0){
            return -1;
        }
        if (n <= 1){
            return n;
        }
        int ans = 1;
        while (n > 1){
            ans *= n;
            n--;
        }
        return ans;
    }
}
