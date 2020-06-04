package com.xuhu.study.Utils;

/**
 * @author xuhu
 * @date 2019-10-31 9:55
 */
public class ListNode<T> {
    public T val;
    public ListNode<T> next;
    public ListNode(T x){
        val = x;
        next = null;
    }
}
