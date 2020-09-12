package com.xuhu.study.geekbang.wangzheng.dataStructure.Class28.T01;

import com.xuhu.study.Utils.ListUtils;
import com.xuhu.study.Utils.TreeOperation;
import com.xuhu.study.Utils.TreeUtils;

/**
 * @author xuhu
 * @date 2020-09-12 14:38
 *
 * 大根堆  即 大的数字在上面
 */
public class BigHeap {

    private int[] a; // 用作存储堆中的元素
    private int n;   // 堆中可以存储的最大的元素个数
    private int count;// 堆中已经存储的元素个数


    public BigHeap(int capacity) {
        this.a = new int[capacity+1];
        this.n = capacity;
        this.count = 0;
    }

    /**
     * 插入思想  添加到完全二叉树的末尾再依次往上调整
     * @param num 待插入数据
     */
    public void insert(int num){
        if (count >= n){
            return; // 堆已经满了
        }
        ++count;
        a[count] = num;
        int i = count;
        while (i/2 > 0 && a[i] > a[i/2]){
            swap(i,i/2);
            i /= 2;
        }
    }

    /**
     * 删除定点元素思想
     * 交换第一个与最后一个数
     * 总数减一（等同于使最后一个被标记删除）
     * 然后自上而下再堆化一遍
     */
    public void removeTop(){
        if (count == 0) return;
        a[1] = a[count];
        count--;
        heapify(count,1);
    }

    /**
     * 堆化
     * @param n 当前容量大小
     * @param i 当前堆化结点下标
     */
    private void heapify(int n, int i){
        while (true){
            int maxPos = i;
            if (i * 2 <= n && a[i] < a[i*2]){
                maxPos = i*2;
            }
            if (i*2 + 1 <= n && a[maxPos] < a[i*2+1]){
                maxPos = i*2 + 1;
            }
            if (maxPos == i){
                break;
            }
            swap(i,maxPos);
            i = maxPos;
        }
    }



    public void showHeap(){
        for (int i = 1; i <= count; i++){
            System.out.print(a[i] + "\t");
        }
    }

    private void swap(int m, int n){
        int temp = a[m];
        a[m] = a[n];
        a[n] = temp;
    }
}
