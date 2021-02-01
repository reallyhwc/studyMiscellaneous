package com.xuhu.study.geekbang.wangzheng.dataStructure.SpringFestival.D02.T11;

class MyCircularDeque {

    private int[] elements;
    int size;

    int head;
    int tail;

    /**
     * Initialize your data structure here. Set the size of the deque to be k.
     */
    public MyCircularDeque(int k) {
        elements = new int[k + 1];
        size = 0;
        head = 0;
        tail = 0;
    }

    /**
     * Adds an item at the front of Deque. Return true if the operation is successful.
     */
    public boolean insertFront(int value) {
        if (!isFull()) {
            head--;
            head = (head + elements.length) % (elements.length);
            elements[head] = value;
            size++;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Adds an item at the rear of Deque. Return true if the operation is successful.
     */
    public boolean insertLast(int value) {
        if (!isFull()) {
            elements[tail] = value;
            tail++;
            tail = tail % (elements.length);
            size++;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Deletes an item from the front of Deque. Return true if the operation is successful.
     */
    public boolean deleteFront() {
        if (!isEmpty()) {
            head++;
            head = head % (elements.length);
            size--;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Deletes an item from the rear of Deque. Return true if the operation is successful.
     */
    public boolean deleteLast() {
        if (!isEmpty()) {
            tail--;
            tail = (tail + (elements.length)) % (elements.length);
            size--;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Get the front item from the deque.
     */
    public int getFront() {
        if (!isEmpty()) {
            return elements[head];
        } else {
            return -1;
        }
    }

    /**
     * Get the last item from the deque.
     */
    public int getRear() {
        if (!isEmpty()) {
            return elements[(tail + elements.length - 1) % (elements.length)];
        } else {
            return -1;
        }
    }

    /**
     * Checks whether the circular deque is empty or not.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Checks whether the circular deque is full or not.
     */
    public boolean isFull() {
        return size >= elements.length - 1;
    }
}