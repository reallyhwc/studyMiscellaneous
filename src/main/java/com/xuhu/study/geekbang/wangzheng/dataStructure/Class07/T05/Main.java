package com.xuhu.study.geekbang.wangzheng.dataStructure.Class07.T05;

import com.xuhu.study.Utils.ListNodeUtil;
import com.xuhu.study.Utils.SystemOutUtil;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        ListNodeUtil.printListNode(solution.middleNode(ListNodeUtil.createListNode(new Integer[]{1,2,3,4,5})));
        SystemOutUtil.Separate();
        ListNodeUtil.printListNode(solution.middleNode(ListNodeUtil.createListNode(new Integer[]{1})));
        SystemOutUtil.Separate();
        ListNodeUtil.printListNode(solution.middleNode(ListNodeUtil.createListNode(new Integer[]{1,2})));
        SystemOutUtil.Separate();
        ListNodeUtil.printListNode(solution.middleNode(ListNodeUtil.createListNode(new Integer[]{1,2,3,4})));
        SystemOutUtil.Separate();
    }
}