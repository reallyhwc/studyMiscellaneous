package com.xuhu.study.geekbang.wangzheng.dataStructure.SpringFestival.D02.T06;

import com.xuhu.study.Utils.ListNode;

/**
 * @author xuhu
 * @date 2021-01-12 21:38
 */
public class CircularQueue {
    private int size;
    private int[] array;
    private int head;
    private int tail;

    public CircularQueue(int size) {
        array = new int[size+1];
        this.size = size;
        head = 0;
        tail = 0;
    }


    public boolean isEmpty(){
        return head == tail;
    }

    public void add(int number){
        if (getSize() == size){
            throw new RuntimeException("full");
        }
        array[tail] = number;
        tail = ((tail+1) % (size + 1));
    }

    public int poll(){
        if (isEmpty()){
            throw new RuntimeException("isEmpty");
        }
        int ans = array[head];
        head = ((head + 1) % (size + 1));
        return ans;
    }

    public int peek() {
        if (isEmpty()){
            throw new RuntimeException("isEmpty");
        }
        return array[head];
    }

    public int getSize(){
        return tail >= head ? tail - head : tail + size + 1 - head;
    }
}
