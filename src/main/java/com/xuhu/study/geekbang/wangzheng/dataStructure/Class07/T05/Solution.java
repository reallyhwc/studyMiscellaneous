package com.xuhu.study.geekbang.wangzheng.dataStructure.Class07.T05;

import com.xuhu.study.Utils.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 * // 05求链表的中间结点
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode p1 = head;
        ListNode p2 = head;
        while (p2.next != null){
            p1 = p1.next;
            p2 = p2.next;
            if(p2.next != null)p2 = p2.next;
        }
        return p1;
    }
}