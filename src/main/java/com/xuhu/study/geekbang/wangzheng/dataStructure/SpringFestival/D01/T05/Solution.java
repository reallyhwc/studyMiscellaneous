package com.xuhu.study.geekbang.wangzheng.dataStructure.SpringFestival.D01.T05;

import com.xuhu.study.Utils.ListNode;

/**
 * @author xuhu
 * @date 2020-12-21 19:51
 * 实现单链表反转
 */
public class Solution {

    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode<Integer> ans = new ListNode<>(Integer.MIN_VALUE);
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            ans.next = head;
            head.next = prev;
            prev = head;
            head = next;
        }
        return ans.next;
    }
}
