package com.xuhu.study.geekbang.wangzheng.dataStructure.SpringFestival.D01.T12;


import org.assertj.core.internal.cglib.asm.$Handle;

import java.util.List;

class Solution {

    /**
     * 分治思路，每次合并两个，直到最后只剩一个
     * @param lists list
     * @return node
     */
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        while (lists.length > 1) {
            int newLen = ((lists.length + 1) / 2);
            ListNode[] temp = new ListNode[newLen];
            for (int i = 0; i < newLen; i++){
                temp[i] = mergeNode(lists[2*i], (2*i+1)>= lists.length ? null : lists[2 * i+1]);
            }
            lists = temp;
        }
        return lists[0];
    }

    public ListNode mergeNode(ListNode node1, ListNode node2){
        if (node1 == null){
            return node2;
        }
        if (node2 == null){
            return node1;
        }
        ListNode ans = new ListNode(-1);
        ListNode node = ans;
        while (node1 != null || node2 != null){
            int val;
            if (node1 == null || (node2 != null && node1.val > node2.val)){
                val = node2.val;
                node2 = node2.next;
            }else{
                val = node1.val;
                node1 = node1.next;
            }
            ListNode temp = new ListNode(val);
            node.next = temp;
            node = node.next;
        }
        return ans.next;
    }

    /**
     * 虽然时间很长，但好歹是自己写出来的，保留代码
     * 还有一种分治的想法 - 每次合并两个直到最后只剩一个
     * 还有一种维护优先队列的想法，也可以搞一搞
     *
     * @param lists list
     * @return node
     */
    public ListNode mergeKLists01(ListNode[] lists) {
        ListNode ans = new ListNode(-1);
        ListNode node = ans;
        if (lists.length == 0) {
            return ans.next;
        }
        if (lists.length == 1) {
            return lists[0];
        }
        int len = lists.length;
        boolean empty = true;
        int minVal = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < len; i++) {
            if (lists[i] != null) {
                empty = false;
                if (lists[i].val < minVal) {
                    minVal = lists[i].val;
                    minIndex = i;
                }
            }
        }
        if (empty) {
            return ans.next;
        }

        while (!empty) {
            ListNode temp = new ListNode(lists[minIndex].val);
            node.next = temp;
            node = node.next;
            lists[minIndex] = lists[minIndex].next;

            empty = true;
            minVal = Integer.MAX_VALUE;
            minIndex = -1;
            for (int i = 0; i < len; i++) {
                if (lists[i] != null) {
                    empty = false;
                    if (lists[i].val < minVal) {
                        minVal = lists[i].val;
                        minIndex = i;
                    }
                }
            }
        }
        return ans.next;
    }
}