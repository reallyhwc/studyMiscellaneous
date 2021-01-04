package com.xuhu.study.geekbang.wangzheng.dataStructure.SpringFestival.D01.T12;

import com.xuhu.study.Utils.ListNodeUtil;

import java.util.List;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        ListNode node1_5 = new ListNode(5);
        ListNode node1_4 = new ListNode(4,node1_5);
        ListNode node1_1 = new ListNode(1,node1_4);

        ListNode node2_4 = new ListNode(4);
        ListNode node2_3 = new ListNode(3,node2_4);
        ListNode node2_1 = new ListNode(1,node2_3);

        ListNode node3_6 = new ListNode(6);
        ListNode node3_2 = new ListNode(2,node3_6);
        printNode(solution.mergeKLists(new ListNode[]{node1_1,node2_1,node3_2}));
    }

    private static void printNode(ListNode node){
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}