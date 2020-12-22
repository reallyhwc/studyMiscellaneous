package com.xuhu.study.geekbang.wangzheng.dataStructure.SpringFestival.D01.T06;


import com.xuhu.study.Utils.ListNode;

import java.util.Collections;
// 实现两个有序的链表合并为一个有序链表
public class Solution {

    public ListNode merge(ListNode<Integer> node1, ListNode<Integer> node2){
        if (node1 == null){
            return node2;
        }
        if (node2 == null){
            return node1;
        }
        ListNode node = new ListNode<>(-1);
        ListNode ans = node;
        while (node1 != null || node2 != null){
            if (node1 == null || node1.val > node2.val){
                node.next = new ListNode<>(node2.val);
                node = node.next;
                node2 = node2.next;
            }else {
                node.next = new ListNode<>(node1.val);
                node = node.next;
                node1 = node1.next;
            }
        }

        return ans.next;
    }
}
