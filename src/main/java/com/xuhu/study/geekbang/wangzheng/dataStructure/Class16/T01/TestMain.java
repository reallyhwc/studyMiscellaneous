package com.xuhu.study.geekbang.wangzheng.dataStructure.Class16.T01;

/**
 * @author xuhu
 * @date 2020-06-30 19:52
 *
 * 1：查找第一个值等于给定值的元素 的下标
 *     a: 所有元素都比这个目标元素大                            目标返回值    -1
 *     b: 所有元素都比这个目标元素小                            目标返回值    -1
 *     c: 存在等值目标元素但是为第一位                           目标返回值   0
 *     d: 存在等值目标元素但是为最后一位                          目标返回值  lastIndex
 *     e: 存在等值目标元素但是整个数组中前一大半都为等值目标元素  目标返回值   第一个目标元素下标
 *     f: 存在等值目标元素但是整个数组中后一大半都为等值目标元素  目标返回值   第一个目标元素下标
 *     g: 不存在等值目标元素（但是目标元素在最大最小值区间之间）  目标返回值   -1
 *     h: 存在等值目标元素但是整个数组中中间一半都为等值目标元素  目标返回值   第一个目标元素下标
 *     i:
 *
 */
public class TestMain {

    public static void main(String[] args) {
        FindFirstTargetIndex find = new FindFirstTargetIndex();
//        1：查找第一个值等于给定值的元素 的下标
//        a: 所有元素都比这个目标元素大                            目标返回值    -1
        System.out.println(find.findIndex(new int[]{1,3,4,5,6,8,8,8,11,18},0));
//        b: 所有元素都比这个目标元素小                            目标返回值    -1
        System.out.println(find.findIndex(new int[]{1,3,4,5,6,8,8,8,11,18},20));
//        c: 存在等值目标元素但是为第一位                           目标返回值   0
        System.out.println(find.findIndex(new int[]{1,3,4,5,6,8,8,8,11,18},1));
//        d: 存在等值目标元素但是为最后一位                          目标返回值  lastIndex
        System.out.println(find.findIndex(new int[]{1,3,4,5,6,8,8,8,11,18},18));
//        e: 存在等值目标元素但是整个数组中前一大半都为等值目标元素  目标返回值   第一个目标元素下标
        System.out.println(find.findIndex(new int[]{1,1,1,1,1,1,1,1,11,18},1));
//        f: 存在等值目标元素但是整个数组中后一大半都为等值目标元素  目标返回值   第一个目标元素下标
        System.out.println(find.findIndex(new int[]{1,3,4,5,6,8,8,8,8,8},8));
//        g: 不存在等值目标元素（但是目标元素在最大最小值区间之间）  目标返回值   -1
        System.out.println(find.findIndex(new int[]{1,3,4,5,6,8,8,8,11,18},7));
//        h: 存在等值目标元素但是整个数组中中间一半都为等值目标元素  目标返回值   第一个目标元素下标
//        i:
        System.out.println(find.findIndex(new int[]{1,3,8,8,8,8,8,8,11,18},8));
    }

}
