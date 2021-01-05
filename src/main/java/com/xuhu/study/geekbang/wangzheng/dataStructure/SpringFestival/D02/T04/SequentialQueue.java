package com.xuhu.study.geekbang.wangzheng.dataStructure.SpringFestival.D02.T04;

/**
 * @author xuhu
 * @date 2021-01-05 22:24
 * 用数组实现一个顺序队列
 * 并不难 根据百度百科的 顺序队列的意思来即可
 */
public class SequentialQueue {

    private int size;
    private int headIndex;
    private int tailIndex;

    private int[] arr;

    public SequentialQueue(int size){
        this.size = size;
        headIndex = 0;
        tailIndex = 0;
        arr = new int[size];
    }

    public boolean isEmpty(){
        return tailIndex <= headIndex;
    }

    public void add(int number){
        if (headIndex >= size){
            throw new RuntimeException("full!");
        }
        arr[tailIndex++] = number;
    }

    public int poll(){
        if (this.isEmpty()){
            throw new RuntimeException("isEmpty");
        }
        return arr[headIndex++];
    }

    public int peek() {
        if (this.isEmpty()){
            throw new RuntimeException("isEmpty");
        }
        return arr[headIndex];
    }

    public int getSize(){
        return tailIndex - headIndex;
    }
}
