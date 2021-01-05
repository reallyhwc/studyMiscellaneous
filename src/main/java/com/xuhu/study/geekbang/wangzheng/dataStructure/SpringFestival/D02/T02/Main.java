package com.xuhu.study.geekbang.wangzheng.dataStructure.SpringFestival.D02.T02;

import com.xuhu.study.geekbang.wangzheng.dataStructure.SpringFestival.D02.T01.SequentialStack;

/**
 * @author xuhu
 * @date 2021-01-05 21:48
 */
public class Main {

    public static void main(String[] args) {
        ChainStack stack = new ChainStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.poll());
        System.out.println(stack.peek());
        System.out.println(stack.poll());
        stack.push(5);
        stack.push(6);
        while (!stack.isEmpty()){
            System.out.println(stack.poll());
        }
    }
}
