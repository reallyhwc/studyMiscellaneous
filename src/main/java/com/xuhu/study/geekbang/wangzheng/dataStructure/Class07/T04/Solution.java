package com.xuhu.study.geekbang.wangzheng.dataStructure.Class07.T04;

import com.xuhu.study.Utils.ListNode;

/**
 * @author xuhu
 * @date 2020-06-05 11:30
 * 07 T04删除链表的倒数第N个结点
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 如果n < 1 返回null
        if(n < 1) return null;
        // 先定义一个快指针，先走n-1步
        ListNode before = head;
        while (n > 1){
            before = before.next;
            n--;
        }
        ListNode after = new ListNode(-1);
        after.next = head;
        ListNode result = after;
        // 再定义一个慢指针指向head的前一个，跟快指针同步走直到快指针抵达队尾
        while (before.next != null){
            before = before.next;
            after = after.next;
        }
        // 需要注意，在正常情况下，目前after的位置处于 待删除结点的前面一个
        if(after != null && after.next != null){
            if(after.next.next != null){
                // 待删除结点的下一个也不为空
                // 直接便捷使用ListNode特性跳过待删除结点即可
                ListNode tempNode = after.next.next;
                after.next = tempNode;
            }else {
                // 待删除结点已经是链表的最后一个了
                after.next = null;
            }
        }
        return result.next;
    }
}