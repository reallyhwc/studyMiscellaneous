package com.xuhu.study.geekbang.wangzheng.dataStructure.Class07.T01;

import com.xuhu.study.Utils.ListNode;
import com.xuhu.study.Utils.ListNodeUtil;
import com.xuhu.study.Utils.SystemOutUtil;

/**
 * @author xuhu
 * @date 2020-06-05 10:04
 */
public class Test {

    public static void main(String[] args) {
        ListNodeUtil.printListNode(ReverseListNode.reverse(ListNodeUtil.createListNode(new Integer[]{1,2,3,4,5,6,7,8,9})));
        SystemOutUtil.Separate();
        ListNodeUtil.printListNode(ReverseListNode.reverse(ListNodeUtil.createListNode(new Integer[]{})));
        SystemOutUtil.Separate();
        ListNodeUtil.printListNode(ReverseListNode.reverse(ListNodeUtil.createListNode(new Integer[]{1})));
        SystemOutUtil.Separate();
        ListNodeUtil.printListNode(ReverseListNode.reverse(ListNodeUtil.createListNode(new Integer[]{1,2})));
    }
}
