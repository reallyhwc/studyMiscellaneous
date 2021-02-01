package com.xuhu.study.geekbang.wangzheng.dataStructure.SpringFestival.D02.T11;

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */

public class Main {
    public static void main(String[] args){


        MyCircularDeque circularDeque = new MyCircularDeque(3); // 设置容量大小为3
        System.out.println(circularDeque.insertLast(1));			        // 返回 true
        System.out.println(circularDeque.insertLast(2));			        // 返回 true
        System.out.println(circularDeque.insertFront(3));			    // 返回 true
        System.out.println(circularDeque.insertFront(4));			    // 已经满了，返回 false
        System.out.println(circularDeque.getRear());  				            // 返回 2
        System.out.println(circularDeque.isFull());				                // 返回 true
        System.out.println(circularDeque.deleteLast());			                // 返回 true
        System.out.println(circularDeque.insertFront(4));			    // 返回 true
        System.out.println(circularDeque.getFront());				            // 返回 4
    }
}