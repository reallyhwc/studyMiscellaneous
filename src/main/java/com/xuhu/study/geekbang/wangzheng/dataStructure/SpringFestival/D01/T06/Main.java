package com.xuhu.study.geekbang.wangzheng.dataStructure.SpringFestival.D01.T06;


import com.xuhu.study.Utils.ListNodeUtil;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNodeUtil.printListNode(solution.merge(ListNodeUtil.createListNode(new Integer[]{1,3,5,7,9}), ListNodeUtil.createListNode( new Integer[]{2,4,6,8,10})));
    }
}
