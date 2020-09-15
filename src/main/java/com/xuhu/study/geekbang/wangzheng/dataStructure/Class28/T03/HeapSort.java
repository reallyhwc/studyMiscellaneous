package com.xuhu.study.geekbang.wangzheng.dataStructure.Class28.T03;

/**
 * @author xuhu
 * @date 2020-09-14 19:39
 */
public class HeapSort {


    // n表示数据的个数，数组a中的数据从下标1到n的位置。
    /**
     * 堆 排序算法
     * @param a 数组
     * @param n n 表示数据个数 排序算法将会排序 下标1 - n 之间的数据
     */
    public static void sort(int[] a, int n) {
        // 首先 建堆
        buildHeap(a, n);
        int k = n;
        while (k > 1) {
            swap(a, 1, k);
            --k;
            heapify(a, k, 1);
        }
    }


    private static void buildHeap(int[] a, int n) {
        for (int i = n/2; i >= 1; --i) {
            //从中间结点到根节点 对于每个结点进行堆化（恩，这样看起来代码比较简洁）
            //因为对于数组形式存储的堆来说，中间结点之后的所有结点 都是叶子结点
            //所以对每个非叶子结点进行堆化就好了
            heapify(a, n, i);
        }
    }

    private static void heapify(int[] a, int n, int i) {
        // 自上而下堆化
        while (true) {
            int maxPos = i;
            if (i*2 <= n && a[i] < a[i*2]) maxPos = i*2;
            if (i*2+1 <= n && a[maxPos] < a[i*2+1]) maxPos = i*2+1;
            if (maxPos == i) break;
            swap(a, i, maxPos);
            i = maxPos;
        }
    }

    private static void swap(int[] a, int m, int n){
        int temp = a[m];
        a[m] = a[n];
        a[n] = temp;
    }
}
