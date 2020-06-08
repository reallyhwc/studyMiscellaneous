package com.xuhu.study.geekbang.wangzheng.dataStructure.Class09.T01;

import com.xuhu.study.Utils.ListNode;

import java.util.List;

/**
 * @author xuhu
 * @date 2020-06-08 18:52
 * 本题测试使用LeetCode 232 用栈实现队列，按照题意这里采用链表
 */
class MyQueue {

    private int count;

    private ListNode head;
    private ListNode end;

    /** Initialize your data structure here. */
    public MyQueue() {
        count = 0;
        head = null;
        end = null;
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        ListNode node = new ListNode(x);
        if(empty()){
            node = new ListNode(x);
            head = node;
            end = node;
        }else {
            end.next = node;
            end = end.next;
        }
        count++;
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(empty()){
            return -1;
        }
        int val = (Integer) head.val;
        if(count == 1){
            head = null;
            end = null;
        }else {
            head = head.next;
        }
        count--;
        return val;
    }

    /** Get the front element. */
    public int peek() {
        if(empty()){
            return -1;
        }else {
            return (Integer)head.val;
        }
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return count == 0;
    }
}