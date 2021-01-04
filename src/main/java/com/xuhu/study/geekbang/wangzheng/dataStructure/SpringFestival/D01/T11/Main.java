package com.xuhu.study.geekbang.wangzheng.dataStructure.SpringFestival.D01.T11;

import com.xuhu.study.Utils.ListNode;
import com.xuhu.study.Utils.ListNodeUtil;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        ListNode node = ListNodeUtil.createListNode(new Integer[]{3,2,0,4});
        ListNode node1 = ListNodeUtil.createListNode(new Integer[]{3,2,0,4});
        node.next.next.next.next = node.next;
        System.out.println(solution.hasCycle(node));
        System.out.println(solution.hasCycle(node1));
    }
}