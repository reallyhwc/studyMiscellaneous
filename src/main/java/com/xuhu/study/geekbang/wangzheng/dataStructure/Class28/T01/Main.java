package com.xuhu.study.geekbang.wangzheng.dataStructure.Class28.T01;

/**
 * @author xuhu
 * @date 2020-09-12 16:48
 */
public class Main {

    public static void main(String[] args) {
        int capacity = 10;
        BigHeap bigHeap = new BigHeap(capacity);
        for (int i = 0; i < capacity; i++){
            bigHeap.insert(i+1);
        }
        System.out.println();
        bigHeap.showHeap();
        System.out.println();

//        for (int i = 0; i < capacity; i++){
//            bigHeap.removeTop();
//            System.out.println();
//            bigHeap.showHeap();
//        }
        bigHeap.showTreeHeap();
    }
}
