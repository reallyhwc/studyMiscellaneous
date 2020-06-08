package com.xuhu.study.geekbang.wangzheng.dataStructure.Class09.T01;

/**
 * @author xuhu
 * @date 2020-06-08 19:14
 */
public class Main {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);

        System.out.println(queue.peek());
        System.out.println(queue.pop());
        System.out.println(queue.empty());
    }
}
