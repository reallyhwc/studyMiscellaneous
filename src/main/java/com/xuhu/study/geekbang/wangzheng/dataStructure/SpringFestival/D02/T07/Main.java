package com.xuhu.study.geekbang.wangzheng.dataStructure.SpringFestival.D02.T07;

import com.xuhu.study.geekbang.wangzheng.dataStructure.SpringFestival.D02.T06.CircularQueue;

/**
 * @author xuhu
 * @date 2021-01-05 22:23
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(getFibonacci(1));
        System.out.println(getFibonacci(2));
        System.out.println(getFibonacci(3));
        System.out.println(getFibonacci(4));
        System.out.println(getFibonacci(5));
        System.out.println(getFibonacci(6));
        System.out.println(getFibonacci(7));
        System.out.println(getFibonacci(8));
        System.out.println(getFibonacci(9));
        System.out.println(getFibonacci(10));
    }

    private static int getFibonacci(int n){
        if (n <= 0){
            return -1;
        }
        if (n == 1 || n == 2){
            return 1;
        }
        int a1 = 1;
        int a2 = 1;
        for (int i = 2; i < n; i++) {
            int sum = a1 + a2;
            a1 = a2;
            a2 = sum;
        }
        return a2;
    }
}
