package com.xuhu.study.geekbang.wangzheng.dataStructure.Class15.T02;

/**
 * @author xuhu
 * @date 2020-06-22 11:12
 * 使用二分查找法 求平方根-精确小数点后6位
 */
public class SquareRoot {
    private static final  double MIN_DIFF = 0.000001;

    public static double calculateSquareRoot(double num){
        if(num > 1){
            return calculate(0,num,num);
        }else {
            return 1 / calculate(0,1/num,1/num);
        }

    }

    private static double calculate(double begin, double end, double target){
        double mid = (begin + end) / 2;
        double nowTarget = mid * mid;
        if((mid - begin) < MIN_DIFF || Math.abs(nowTarget - target) < MIN_DIFF){
            return mid;
        }
        if(nowTarget > target){
            return calculate(begin,mid,target);
        }else {
            return calculate(mid,end,target);
        }
    }

}
