package com.xuhu.study.geekbang.wangzheng.dataStructure.Class28.T02;

/**
 * @author xuhu
 * @date 2020-09-12 17:13
 */
public class Main {

    public static void main(String[] args) {
        int capacity = 10;
        SmallHeap smallHeap = new SmallHeap(capacity);
        for (int i = 0; i < capacity; i++) {
            smallHeap.insert(capacity - i);
        }
        smallHeap.showHeap();
        System.out.println();
        for (int i = 0; i < capacity; i++) {
            smallHeap.removeTop();
            smallHeap.showHeap();
            System.out.println();
        }
    }
}
