package com.xuhu.study.geekbang.wangzheng.dataStructure.Class06;


import java.util.List;

/**
 * @author xuhu
 * @date 2020-06-03 9:10
 * 学习极客时间 王争 算法与数据结构之美 尝试的解题代码
 *  06课 LRU 实现 使用单链表
 *  本例代码已经经过了充分的测试（已经通过了LeetCode cn 146 题 LRU缓存机制 只是使用单链表效率很低）
 */
public class LRUCache01 {

    private int capacity;
    private int nowCount;
    private ListNode root;

    public LRUCache01(int capacity) {
        this.capacity = capacity;
        nowCount = 0;
        root = null;
    }

    public int get(int key) {
        ListNode temp = root;
        ListNode pre = new ListNode(-1,-1);
        pre.next = temp;
        while (temp != null){
            if(temp.key == key){
                int ans = temp.val;
                if(temp.key != root.key){
                    pre.next = temp.next;
                    ListNode newRoot = new ListNode(key,ans);
                    newRoot.next = root;
                    root = newRoot;
                }
                return ans;
            }else {
                pre = pre.next;
                temp = temp.next;
            }
        }
        return -1;
    }

    public void put(int key, int value) {
        if(get(key) != -1) {
            root.val = value;
            return;
        }
        if(nowCount < capacity){
            ListNode node = new ListNode(key,value);
            node.next = root;
            root = node;
            nowCount++;
        }else {
            ListNode temp = root;
            for(int i = 0; i < capacity-2; i++){
                temp = temp.next;
            }
            temp.next = null;
            ListNode newRoot = new ListNode(key,value);
            if(capacity > 1){
                newRoot.next = root;
            }
            root = newRoot;
        }

    }
}

class ListNode{
    public int key;
    public int val;
    public ListNode next;
    public ListNode(int key, int val){
        this.key = key;
        this.val = val;
        next = null;
    }
}
