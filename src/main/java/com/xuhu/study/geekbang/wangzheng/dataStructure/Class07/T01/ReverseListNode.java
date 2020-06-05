package com.xuhu.study.geekbang.wangzheng.dataStructure.Class07.T01;

import com.xuhu.study.Utils.ListNode;

/**
 * @author xuhu
 * @date 2020-06-05 9:46
 */
public class ReverseListNode {

    public static ListNode reverse(ListNode node){
        if(node == null || node.next == null) return node;
        ListNode ans = null;
        ListNode temp = node;
        while (temp != null){
            node = temp;
            temp = temp.next;
            node.next = ans;
            ans = node;
        }
        return ans;
    }
}
