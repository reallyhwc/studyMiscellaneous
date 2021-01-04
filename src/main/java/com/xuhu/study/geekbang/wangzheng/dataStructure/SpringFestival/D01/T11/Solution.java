package com.xuhu.study.geekbang.wangzheng.dataStructure.SpringFestival.D01.T11;


import com.xuhu.study.Utils.ListNode;

public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null){
            return false;
        }
        ListNode p1 = head;
        ListNode p2 = head.next;
        while (p2 != null && p2.next != null){
            if (p1 == p2){
                return true;
            }
            p1 = p1.next;
            p2 = p2.next.next;
        }
        return false;
    }
}