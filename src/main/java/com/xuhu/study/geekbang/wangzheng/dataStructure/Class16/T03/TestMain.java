package com.xuhu.study.geekbang.wangzheng.dataStructure.Class16.T03;


import com.xuhu.study.geekbang.wangzheng.dataStructure.Class16.T02.FindLastTargetIndex;

/**
 * @author xuhu
 * @date 2020-06-30 19:52
 * 3：查找第一个大于等于给定值的元素 的下标
 *     a: 所有元素都比这个目标元素大                                目标返回值       0
 *     b: 所有元素都比这个目标元素小                                目标返回值       -1  没有比这个给定元素大的
 *     c: 存在等值目标元素但是为第一位                              目标返回值        0
 *     d: 存在不等值但符合要求的 目标元素 为第一位                   目标返回值        0
 *     e: 存在等值目标元素但是为最后一位                             目标返回值       lastIndex
 *     f: 存在不等值但符合要求的 目标元素 为最后一位                 目标返回值        lastIndex
 *     g: 存在等值目标元素但是整个数组中前一大半都为等值目标元素      目标返回值       0
 *     h: 存在等值目标元素但是整个数组中后一大半都为等值目标元素      目标返回值       第一个目标元素的下标
 *     i: 不存在等值目标元素（但是目标元素在最大最小值区间之间）      目标返回值       第一个目标元素的下标
 *     j: 存在等值目标元素但是整个数组中中间一半都为等值目标元素      目标返回值       第一个目标元素的下标
 *     k:
 */
public class TestMain {

    public static void main(String[] args) {
        FindFirstNotLessThanTarget find = new FindFirstNotLessThanTarget();
//        3：查找第一个大于等于给定值的元素 的下标
//        a: 所有元素都比这个目标元素大                                目标返回值       0
        System.out.println(find.findIndex(new int[]{1,3,4,5,6,8,8,8,11,18},0));

//        b: 所有元素都比这个目标元素小                                目标返回值       -1  没有比这个给定元素大的
        System.out.println(find.findIndex(new int[]{1,3,4,5,6,8,8,8,11,18},20));

//        c: 存在等值目标元素但是为第一位                              目标返回值        0
        System.out.println(find.findIndex(new int[]{1,3,4,5,6,8,8,8,11,18},1));

//        d: 存在不等值但符合要求的 目标元素 为第一位                   目标返回值        0
        System.out.println(find.findIndex(new int[]{1,3,4,5,6,8,8,8,11,18},0));

//        e: 存在等值目标元素但是为最后一位                             目标返回值       lastIndex
        System.out.println(find.findIndex(new int[]{1,3,4,5,6,8,8,8,11,18},18));

//        f: 存在不等值但符合要求的 目标元素 为最后一位                 目标返回值        lastIndex
        System.out.println(find.findIndex(new int[]{1,3,4,5,6,8,8,8,11,18},15));

//        g: 存在等值目标元素但是整个数组中前一大半都为等值目标元素      目标返回值       0
        System.out.println(find.findIndex(new int[]{8,8,8,8,8,8,8,8,11,18},8));

//        h: 存在等值目标元素但是整个数组中后一大半都为等值目标元素      目标返回值       第一个目标元素的下标
        System.out.println(find.findIndex(new int[]{1,3,4,5,6,8,8,8,8,8},8));

//        i: 不存在等值目标元素（但是目标元素在最大最小值区间之间）      目标返回值       第一个目标元素的下标
        System.out.println(find.findIndex(new int[]{1,3,4,5,6,8,8,8,11,18},7));

//        j: 存在等值目标元素但是整个数组中中间一半都为等值目标元素      目标返回值       第一个目标元素的下标
        System.out.println(find.findIndex(new int[]{1,3,4,8,8,8,8,8,11,18},8));

//        k: 原始测试
        System.out.println(find.findIndex(new int[]{1,3,4,5,6,8,8,8,11,18},7));
    }

}
