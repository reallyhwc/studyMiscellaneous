package com.xuhu.study.geekbang.wangzheng.dataStructure.SpringFestival.D02.T05;


import com.xuhu.study.Utils.ListNode;

/**
 * @author xuhu
 * @date 2021-01-12 20:38
 * 链式队列
 */
public class ChainQueue {
    private int size;
    private ListNode<Integer> head;
    private ListNode<Integer> tail;

    public ChainQueue(int i){
        head = null;
        tail = null;
        size = 0;
    }


    public boolean isEmpty(){
        return size == 0;
    }

    public void add(int number){
        ListNode node = new ListNode(number);
        if (size == 0){
            head = node;
            tail = node;
        }else {
            tail.next = node;
            tail = tail.next;
        }
        size++;
    }

    public int poll(){
        if (isEmpty()){
            throw new RuntimeException("isEmpty");
        }
        int ans = head.val;
        head = head.next;
        size--;
        return ans;
    }

    public int peek() {
        if (isEmpty()){
            throw new RuntimeException("isEmpty");
        }
        return head.val;
    }

    public int getSize(){
        return size;
    }
}
