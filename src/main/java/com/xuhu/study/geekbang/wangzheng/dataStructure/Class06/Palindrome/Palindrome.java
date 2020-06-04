package com.xuhu.study.geekbang.wangzheng.dataStructure.Class06.Palindrome;


import com.xuhu.study.Utils.ListNode;
import com.xuhu.study.Utils.ListNodeUtil;

import java.util.Stack;

/**
 * @author xuhu
 * @date 2020-06-03 16:57
 */
public class Palindrome {

    public static boolean isPalindromeStack(ListNode node){
        if(node == null || node.next == null) return true;
        ListNode p1 = node;
        ListNode p2 = node;
        Stack<ListNode> stack = new Stack<>();
        while (p2.next != null && p2.next.next != null){
            stack.push(p1);
            p1 = p1.next;
            p2 = p2.next.next;
        }
        if(p2.next != null){
            stack.push(p1);
        }
        p1 = p1.next;
        while (!stack.isEmpty() && p1 != null){
            if(stack.pop().val != p1.val){
                return false;
            }
            p1 = p1.next;
        }
        return stack.isEmpty() && p1 == null;
    }


    public static boolean isPalindrome(ListNode node){
        if(node == null || node.next == null) return true;
        ListNode p1 = node;
        ListNode p2 = node;
        ListNode pre = new ListNode(-1);
        pre.next = node;
        while (p2.next != null && p2.next.next != null){
            pre = pre.next;
            p1 = p1.next;
            p2 = p2.next.next;
        }
        if(p2.next == null){
            // 奇数个形式
            ListNode afterNode = p1.next;
            pre.next = null;
            return isSameNode(node,afterNode);
        }else {
            // 偶数个长度
            ListNode afterNode = p1.next;
            p1.next = null;
            afterNode = ListNodeUtil.revertListNode(afterNode);
            return isSameNode(node,afterNode);
        }
    }

    private static boolean isSameNode(ListNode node1, ListNode node2){
        while (node1 != null && node2 != null){
            if(node1.val != node2.val){
                return false;
            }
            node1 = node1.next;
            node2 = node2.next;
        }
        return node1 == null && node2 == null;
    }
}


