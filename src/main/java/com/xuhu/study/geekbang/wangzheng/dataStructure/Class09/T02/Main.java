package com.xuhu.study.geekbang.wangzheng.dataStructure.Class09.T02;

/**
 * @author xuhu
 * @date 2020-06-08 19:14
 */
public class Main {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);
        System.out.println(queue.enqueue("1"));
        System.out.println(queue.enqueue("2"));
        System.out.println(queue.enqueue("3"));
        System.out.println(queue.enqueue("4"));
        System.out.println(queue.enqueue("5"));
        System.out.println(queue.enqueue("6"));
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
