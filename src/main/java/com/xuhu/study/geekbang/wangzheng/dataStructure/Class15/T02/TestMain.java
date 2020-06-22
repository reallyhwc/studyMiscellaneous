package com.xuhu.study.geekbang.wangzheng.dataStructure.Class15.T02;

/**
 * @author xuhu
 * @date 2020-06-22 14:14
 */
public class TestMain {

    public static void main(String[] args) {

        for (int i = 1; i <= 10000; i++){
            System.out.println("计算平方根"+ i + "的值为："+SquareRoot.calculateSquareRoot(i));
        }

        System.out.println(SquareRoot.calculateSquareRoot(0.25));
    }

}
