package com.xuhu.study.geekbang.wangzheng.dataStructure.SpringFestival.D01.T12;


import org.assertj.core.internal.cglib.asm.$Handle;

class Solution {
    /**
     * 虽然时间很长，但好歹是自己写出来的，保留代码
     * @param lists list
     * @return node
     */
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode ans = new ListNode(-1);
        ListNode node = ans;
        if (lists.length == 0){
            return ans.next;
        }
        if (lists.length == 1){
            return lists[0];
        }
        int len = lists.length;
        boolean empty = true;
        int minVal = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < len ;i++) {
            if (lists[i] != null) {
                empty = false;
                if (lists[i].val < minVal){
                    minVal = lists[i].val;
                    minIndex = i;
                }
            }
        }
        if (empty){
            return ans.next;
        }

        while (!empty){
            ListNode temp = new ListNode(lists[minIndex].val);
            node.next = temp;
            node = node.next;
            lists[minIndex] = lists[minIndex].next;

            empty = true;
            minVal = Integer.MAX_VALUE;
            minIndex = -1;
            for (int i = 0; i < len ;i++) {
                if (lists[i] != null) {
                    empty = false;
                    if (lists[i].val < minVal){
                        minVal = lists[i].val;
                        minIndex = i;
                    }
                }
            }
        }
        return ans.next;
    }
}