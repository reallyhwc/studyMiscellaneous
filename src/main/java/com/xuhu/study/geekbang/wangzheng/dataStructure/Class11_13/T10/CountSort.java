package com.xuhu.study.geekbang.wangzheng.dataStructure.Class11_13.T10;

/**
 * @author xuhu
 * @date 2020-06-15 15:15
 * 实现计数排序  -  其实就是一种特殊的桶排序
 */
public class CountSort {

    public static int[] sort(int[] arrays, int maxNum){
        int[] countArray = new int[maxNum+1];
        int[] ans = new int[arrays.length];
        for(int i = 0; i < arrays.length; i++){
            countArray[arrays[i]]++;
        }
        for (int i = 1; i < maxNum; i++){
            countArray[i] += countArray[i-1];
        }
        for (int i = 0; i < arrays.length; i++){
            int num = arrays[i];
            ans[countArray[num]-1] = num;
            countArray[num]--;
        }

        return ans;

    }
}
