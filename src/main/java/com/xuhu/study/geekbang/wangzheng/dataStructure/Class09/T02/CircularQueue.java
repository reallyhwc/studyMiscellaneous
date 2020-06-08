package com.xuhu.study.geekbang.wangzheng.dataStructure.Class09.T02;

import com.xuhu.study.Utils.ListNode;

/**
 * @author xuhu
 * @date 2020-06-08 18:52
 *
 */

public class CircularQueue {
    // 数组：items，数组大小：n
    private String[] items;
    private int n = 0;
    // head表示队头下标，tail表示队尾下标
    private int head = 0;
    private int tail = 0;

    // 申请一个大小为capacity的数组
    public CircularQueue(int capacity) {
        items = new String[capacity+1];
        n = capacity+1;
    }

    // 入队
    public boolean enqueue(String item) {
        // 如果队列满了
        if((tail + 1) % n == head) return false;
        items[tail] = item;
        tail = (tail+1)%n;
        return true;
    }

    // 出队
    public String dequeue() {
        if(head == tail) return null;
        String ans = items[head];
        head = (head+1)%n;
        return ans;
    }
}