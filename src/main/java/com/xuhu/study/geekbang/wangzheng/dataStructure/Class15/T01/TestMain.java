package com.xuhu.study.geekbang.wangzheng.dataStructure.Class15.T01;

import com.xuhu.study.Utils.ArraysUtils;
import com.xuhu.study.Utils.SystemOutUtil;

import java.util.Arrays;

/**
 * @author xuhu
 * @date 2020-06-22 9:57
 */
public class TestMain {

    private static final int ARRAYS_LENGTH = 100000000;
    private static final int TIMES = 100;

    public static void main(String[] args) {
        int[] array = ArraysUtils.randomlyGeneratedIntDoubleArray(1,ARRAYS_LENGTH,ARRAYS_LENGTH)[0];
        Arrays.sort(array);
        System.out.println(ARRAYS_LENGTH+"长度数组排序完成！");
        BinarySearch binarySearch = new BinarySearch();
        for (int i = 0; i < TIMES; i++){
            System.out.println("开始执行第"+i+"次查找！");
            long time1 = System.currentTimeMillis();
            int random = (int) (Math.random()*ARRAYS_LENGTH);
            int ans = binarySearch.search(array,random);
            long time2 = System.currentTimeMillis();
            long time = time2-time1;
            System.out.println("第"+i+"次查找完成！"+"耗时"+time+"毫秒！");
            System.out.println("第"+i+"次查找结果" + ans);
            SystemOutUtil.Separate();
        }

    }

}
