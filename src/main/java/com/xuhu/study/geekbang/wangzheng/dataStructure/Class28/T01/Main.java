package com.xuhu.study.geekbang.wangzheng.dataStructure.Class28.T01;

/**
 * @author xuhu
 * @date 2020-09-12 16:48
 */
public class Main {

    public static void main(String[] args) {
        BigHeap bigHeap = new BigHeap(10);
        bigHeap.insert(1);
        bigHeap.insert(2);
        bigHeap.insert(3);
        bigHeap.insert(4);
        bigHeap.insert(5);
        bigHeap.insert(6);
        bigHeap.insert(7);
        bigHeap.insert(8);
        bigHeap.insert(9);
        bigHeap.showHeap();
        bigHeap.insert(10);
        System.out.println();
        bigHeap.showHeap();

        for (int i = 0; i < 10; i++){
            bigHeap.removeTop();
            System.out.println();
            bigHeap.showHeap();
        }
    }
}
