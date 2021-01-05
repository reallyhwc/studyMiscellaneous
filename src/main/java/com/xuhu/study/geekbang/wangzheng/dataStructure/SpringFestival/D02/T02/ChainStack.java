package com.xuhu.study.geekbang.wangzheng.dataStructure.SpringFestival.D02.T02;

import java.util.List;

/**
 * @author xuhu
 * @date 2021-01-05 21:53
 * 用链表实现一个链式栈
 */
public class ChainStack {

    private int size;

    private ListNode head;

    public ChainStack() {
        size = 0;
        head = null;
    }



    public boolean isEmpty(){
        return head == null;
    }

    public int size(){
        return size;
    }

    public void push(int number){
        ListNode node = new ListNode(number);
        node.next = head;
        head = node;
    }

    public int poll(){
        if(isEmpty()){
            throw new RuntimeException("isEmpty");
        }
        int ans = head.val;
        head = head.next;
        return ans;
    }

    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("isEmpty");
        }
        return head.val;
    }
}
