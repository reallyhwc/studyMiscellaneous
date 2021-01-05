package com.xuhu.study.geekbang.wangzheng.dataStructure.SpringFestival.D02.T04;

/**
 * @author xuhu
 * @date 2021-01-05 22:23
 */
public class Main {

    public static void main(String[] args) {
        SequentialQueue queue = new SequentialQueue(4);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        queue.add(4);
//        queue.add(5);
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
