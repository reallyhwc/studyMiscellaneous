package com.xuhu.study.geekbang.wangzheng.dataStructure.Class07.T02;

import com.xuhu.study.Utils.ListNode;

/**
 * @author xuhu
 * @date 2020-06-05 10:09
 * 单链表中环的检测
 */
public class TestRing {

    public boolean hasCycle(ListNode node){
        if(node == null || node.next == null) return false;
        ListNode p1 = node;
        ListNode p2 = node.next;
        while (p2.next != null && p2.next.next != null){
            p1 = p1.next;
            p2 = p2.next.next;
            if(p1 == p2){
                return true;
            }
        }
        return false;
    }
}
