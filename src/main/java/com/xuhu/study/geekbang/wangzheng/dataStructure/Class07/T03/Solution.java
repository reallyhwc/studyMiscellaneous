package com.xuhu.study.geekbang.wangzheng.dataStructure.Class07.T03;

import com.xuhu.study.Utils.ListNode;

/**
 * @author xuhu
 * @date 2020-06-05 10:48
 * 07 合并两个有序链表
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode<Integer> l1, ListNode<Integer> l2) {
        ListNode temp = new ListNode(-999);
        ListNode ans = temp;

        while (l1 != null && l2 != null){
            if(l1.val <= l2.val){
                temp.next = new ListNode(l1.val);
                temp = temp.next;
                l1 = l1.next;
            }else {
                temp.next = new ListNode(l2.val);
                temp = temp.next;
                l2 = l2.next;
            }
        }
        if(l1!= null) temp.next = l1;
        if(l2!= null) temp.next = l2;
        return ans.next;
    }
}
