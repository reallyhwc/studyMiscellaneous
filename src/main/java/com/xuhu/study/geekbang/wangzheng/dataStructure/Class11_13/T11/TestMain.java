package com.xuhu.study.geekbang.wangzheng.dataStructure.Class11_13.T11;


import java.util.Arrays;

/**
 * @author xuhu
 * @date 2020-06-16 16:34
 * 测试基数排序10w+电话号码的速度
 * // 为啥基数排序还是比系统自带的慢
 */
public class TestMain {

    private static final int LENGTH_OF_ARRAY = 20000000;

    public static void main(String[] args) {
        String[] array = randomMobilePhoneNum(LENGTH_OF_ARRAY);
        String[] array1 = randomMobilePhoneNum(LENGTH_OF_ARRAY);
        System.out.println("开始实现基数排序！");
        System.out.println("手机号数组总容量：" + LENGTH_OF_ARRAY);
        long time1 = System.currentTimeMillis();
        RadixSort.sort(array,11);
        long time2 = System.currentTimeMillis();
        long differenceTime1 = time2-time1;
        System.out.println("基数排序总耗时：" + differenceTime1 + "毫秒");


        System.out.println("开始实现系统自带排序！");
        System.out.println("手机号数组总容量：" + LENGTH_OF_ARRAY);
        time1 = System.currentTimeMillis();
        Arrays.sort(array1);
        time2 = System.currentTimeMillis();
        differenceTime1 = time2-time1;
        System.out.println("系统自带排序总耗时：" + differenceTime1 + "毫秒");
    }

    private static String[] randomMobilePhoneNum(int nums){
        long time1 = System.currentTimeMillis();
        String[] ans = new String[nums];
        for (int i = 0; i < nums; i++){
            ans[i] = getTelephone();
        }
        System.out.println("随机生成手机号完成！个数：" + nums);
        long time2 = System.currentTimeMillis();
        long differenceTime1 = time2-time1;
        System.out.println("总耗时：" + differenceTime1 + "毫秒");
        return ans;
    }

    private static String[] telFirst="134,135,136,137,138,139,150,151,152,157,158,159,130,131,132,155,156,133,153".split(",");


    public static String getTelephone() {
        String first=telFirst[getNum(0,telFirst.length-1)];
        String second=String.valueOf(getNum(1,888)+10000).substring(1);
        String third=String.valueOf(getNum(1,9100)+10000).substring(1);
        return first+second+third;
    }

    public static int getNum(int start,int end) {
        return (int)(Math.random()*(end-start+1)+start);
    }
}
