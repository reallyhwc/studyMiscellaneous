package com.xuhu.study.geekbang.wangzheng.dataStructure.Class28.T03;

import com.xuhu.study.Utils.ArraysUtils;
import com.xuhu.study.Utils.ListUtils;
import org.mockito.internal.util.collections.ArrayUtils;

import java.util.Arrays;

/**
 * @author xuhu
 * @date 2020-09-14 19:41
 */
public class Main {

    public static void main(String[] args) {
        int[][] arrays = ArraysUtils.randomlyGeneratedIntDoubleArray(1,1000001,10000000);
        arrays[0][0] = 0;
        HeapSort.sort(arrays[0],arrays[0].length-1);
        ListUtils.pringlnArrays(arrays[0]);
    }
}
