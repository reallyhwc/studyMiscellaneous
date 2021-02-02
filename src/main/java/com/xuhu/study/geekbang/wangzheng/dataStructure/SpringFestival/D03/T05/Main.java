package com.xuhu.study.geekbang.wangzheng.dataStructure.SpringFestival.D03.T05;

import com.xuhu.study.Utils.ListUtils;
import com.xuhu.study.geekbang.wangzheng.dataStructure.SpringFestival.D03.Sort;

/**
 * @author xuhu
 * @date 2021-02-02 19:45
 */
public class Main {

    public static void main(String[] args) {
        Sort sort = null;
        ListUtils.pringlnArrays(sort.sort(new int[]{9,8,7,6,5,4,3,2,1}));
        System.out.println("/n-----------------------");
        ListUtils.pringlnArrays(sort.sort(new int[]{}));
        System.out.println("/n-----------------------");
        ListUtils.pringlnArrays(sort.sort(new int[]{1}));
        System.out.println("/n-----------------------");
        ListUtils.pringlnArrays(sort.sort(new int[]{2,1}));
        System.out.println("/n-----------------------");
        ListUtils.pringlnArrays(sort.sort(new int[]{2,1,3}));
        System.out.println("/n-----------------------");
        ListUtils.pringlnArrays(sort.sort(new int[]{4,2,1,3}));
    }
}
