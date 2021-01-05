package com.xuhu.study.geekbang.wangzheng.dataStructure.SpringFestival.D02.T01;

/**
 * @author xuhu
 * @date 2021-01-05 21:36
 * 用数组实现一个顺序栈
 */
public class SequentialStack {

    private int maxSize;
    private int[] array;
    private int top;
    public SequentialStack(int size){
        this.maxSize = size+1;
        this.top = 0;
        this.array = new int[size+1];
    }

    public boolean isEmpty(){
        return top == 0;
    }

    public int size(){
        return top;
    }

    public void push(int number){
        if (top == maxSize-1){
            throw new RuntimeException("full!");
        };
        array[top++] = number;
    }

    public int poll(){
        if(isEmpty()){
            throw new RuntimeException("isEmpty");
        }
        return array[--top];
    }

    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("isEmpty");
        }
        return array[top-1];
    }
}
