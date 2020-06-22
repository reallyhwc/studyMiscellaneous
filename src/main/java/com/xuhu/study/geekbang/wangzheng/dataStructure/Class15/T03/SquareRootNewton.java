package com.xuhu.study.geekbang.wangzheng.dataStructure.Class15.T03;

/**
 * @author xuhu
 * @date 2020-06-22 11:12
 * 使用牛顿迭代法 求平方根-精确小数点后15位
 */
public class SquareRootNewton {
    private static final  double MIN_DIFF = 1e-15;

    public static double sqrtNewton(double num){
        if (num < 0) {
            return Double.NaN;
        }

        double x = num;
        double y = (x + num / x ) / 2;
        while (Math.abs(x-y) > MIN_DIFF){
            x = y;
            y = (x + num / x ) / 2;
        }
        return x;
    }

}
