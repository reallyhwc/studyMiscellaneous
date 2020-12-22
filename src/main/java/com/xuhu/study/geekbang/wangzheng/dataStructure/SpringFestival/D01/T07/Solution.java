package com.xuhu.study.geekbang.wangzheng.dataStructure.SpringFestival.D01.T07;


import com.xuhu.study.Utils.ListNode;

// 实现求链表的中间结点
public class Solution {

    public ListNode getMid(ListNode node){
        if (node == null || node.next == null){
            return node;
        }
        ListNode fast = node;
        while (fast != null && fast.next != null){
            node = node.next;
            fast = fast.next.next;
        }
        return node;
    }
}
