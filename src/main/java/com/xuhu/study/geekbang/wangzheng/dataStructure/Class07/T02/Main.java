package com.xuhu.study.geekbang.wangzheng.dataStructure.Class07.T02;


import com.xuhu.study.Utils.ListNode;

public class Main {
    public static void main(String[] args){
        TestRing testRing = new TestRing();
        ListNode node = new ListNode(3);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(-4);
        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node1;
        System.out.println(testRing.hasCycle(node));
    }
}