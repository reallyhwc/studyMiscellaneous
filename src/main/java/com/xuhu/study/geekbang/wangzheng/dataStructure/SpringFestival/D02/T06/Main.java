package com.xuhu.study.geekbang.wangzheng.dataStructure.SpringFestival.D02.T06;

import com.xuhu.study.geekbang.wangzheng.dataStructure.SpringFestival.D02.T05.ChainQueue;

/**
 * @author xuhu
 * @date 2021-01-05 22:23
 */
public class Main {

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(4);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        queue.add(4);
        queue.add(5);

        System.out.println(queue.poll());
        System.out.println(queue.poll());

        queue.add(6);
        queue.add(7);
//        queue.add(8);

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
