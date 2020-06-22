package com.xuhu.study.geekbang.wangzheng.dataStructure.Class15.T03;


/**
 * @author xuhu
 * @date 2020-06-22 14:14
 */
public class TestMain {

    public static void main(String[] args) {

        for (int i = 1; i <= 1000000; i++){
            System.out.println("计算平方根"+ i + "的值为："+SquareRootNewton.sqrtNewton(i));
        }

        System.out.println(SquareRootNewton.sqrtNewton((0.25)));
    }

}
